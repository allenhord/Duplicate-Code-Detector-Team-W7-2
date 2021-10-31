package edu.odu.cs.cs350;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class DupDetector {

	 //Driver class with the main method
	//global variables
	public static int MaxSubstitutions;
	public static int MinSequenceLength;
	public static ArrayList<String> CppExtensions;
	
	public static void main(String[] args) {
		
		
		//setting default values for dup detector
		 MaxSubstitutions=8;
		 MinSequenceLength=10;
		CppExtensions =new ArrayList<String>();
		CppExtensions.add("cpp");
		CppExtensions.add("h");
		int nSuggestions=-1;
		
		
		//start itarating through the arguments passed
		System.out.println("Files Scanned:");
		int filesScanned=0;
		for(int currArg=0;currArg<args.length;currArg++)
		{
			//if it is the first argument then expectation is it is an int and it is number of suggestions
			if(currArg==0)
			{
				try {
					nSuggestions=Integer.parseInt(args[currArg]);
					
				}
				//catch the error and exit if it is not an int
				catch(Exception e)
				{
					System.out.println("Not an Integer, Expected an integer for number of suggested refactorings as the first input. Ending program");
					System.exit(1);
				}
			}
			
			
			else {
			
			//if it is the second argument thent here is a possibility of it being the properties file
			
			File currFile=new File(args[currArg]);
			String pathString=currFile.toString();
			
			//this is only for the first file check
			if(currFile.exists() && currFile.isFile() && currArg==1 )
			{
				//this is for the optional properties file check
				//check the length of the file that it at least has the extension there 
				if(pathString.length()>4)
				{
					//get the extension check
					int index=pathString.lastIndexOf('.');
					String extension= pathString.substring(index+1);
					
					if(extension=="ini")
					{
						//do somemthing with the properties file
					}
					//if it is a file that has extension from CppExtensions then do stuff
					else if (CppExtensions.contains(extension))
					{
						//display the path to that file
						//TODO store that file information somwhere
						System.out.println(pathString);
						//increment number of files scanned
						filesScanned++;
					}
					else
					{
						throw new IllegalArgumentException("File specified by file path: "+ pathString+" is not accepted");
					}
				}
			}
			
			//this is for the rest of the files if there are arguments
			//check if it is a directory
			else if(currFile.exists() && currFile.isFile()==true)
			{
				int index=pathString.lastIndexOf('.');
				String extension= pathString.substring(index+1);
					if (CppExtensions.contains(extension))
					{
						//display the path to that file
						//TODO store that file information somwhere
						System.out.println(pathString);
						//increment number of files scanned
						filesScanned++;
					}
					else
					{
						throw new IllegalArgumentException("File specified by file path: "+ pathString+" is not accepted");
					}
			}
			//this is the directory path only does 1 level search for now
			else if (currFile.exists() && currFile.isDirectory())
			{
				filesScanned+=recursiveFileSearch(currFile);
			}
			else
			{
				throw new IllegalArgumentException("File or Directory specified by path: "+ pathString+" is not found");
			}
		
		 
			}

	}
	
	

}
	
	//Method to display all files within a directory recursively searching 
	//TODO eventually this needs to return files or do more with them
	private static int recursiveFileSearch(File infile)
	{
		int validFileCount=0;
		if(infile.isDirectory())
		{
			
			File[] files =infile.listFiles();
			for(File file: files)
			{
				if(file.isDirectory())
				{
					recursiveFileSearch(file);
				}
				else
				{	
						String filename=file.toString();
						int index=filename.lastIndexOf('.');
						String extension= filename.substring(index+1);
						if (CppExtensions.contains(extension))
						{
							//display the path to that file
							//TODO store that file information somwhere
							System.out.println(filename);
							//increment number of files scanned
							validFileCount++;
						}
					
				}
			}
		}
		return validFileCount;
	}
}
