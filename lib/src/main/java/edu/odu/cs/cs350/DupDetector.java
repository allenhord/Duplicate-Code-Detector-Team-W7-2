package edu.odu.cs.cs350;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
public class DupDetector {

	 //Driver class with the main method
	//global variables
	public static int MaxSubstitutions=8;
	public static int MinSequenceLength=10;
	public static ArrayList<String> CppExtensions=CppExtensions =new ArrayList<String>();

	
	//create instance of SourceCodeFiles object
	public static SourceCodeFiles currentFiles = new SourceCodeFiles();
	
	
	public static void main(String[] args) {
		
		
		//setting default values for dup detector
		CppExtensions.add("cpp");
		CppExtensions.add("h");
		
		currentFiles.setNumSuggestions(-1);
	
		
		//start iterating through the arguments passed
		System.out.println("Files Scanned:");
		int filesScanned=0;
		for(int currArg=0;currArg<args.length;currArg++)
		{
			//if it is the first argument then expectation is it is an int and it is number of suggestions
		
			if(currArg==0)
			{
				try {
					currentFiles.setNumSuggestions(Integer.parseInt(args[currArg]));
					
				}
				//catch the error and exit if it is not an int
				catch(Exception e)
				{
					System.out.println("Not an Integer, Expected an integer for number of suggested refactorings as the first input. Ending program");
					System.exit(1);
				}
			}
			
			
			else {
			
			//if it is the second argument then there is a possibility of it being the properties file
			
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
						//do something with the properties file
					}
					//if it is a file that has extension from CppExtensions then do stuff
					else if (CppExtensions.contains(extension))
					{
	
						//store filepath to filepatharray & filepathset
						currentFiles.addFilePathArray(pathString);
						
						//display the path to that file
						System.out.println(pathString);
						
						System.out.println("Tries to scann tokens");
						try {
							ArrayList<Token> tokensInFile=ScanFile(currFile);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Scanned tokens");
						
						
						
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
						//store filepath to filepatharray & filepathset
						currentFiles.addFilePathArray(pathString);
						//display the path to that file
						System.out.println(pathString);
						System.out.println("Tries to scann tokens");
						try {
							ArrayList<Token> tokensInFile=ScanFile(currFile);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Scanned tokens");

						//increment number of files scanned
						filesScanned++;
					}
					else
					{
						throw new IllegalArgumentException("File specified by file path: "+ pathString+" is not accepted");
					}
			}
			//this is the directory path only does
			else if (currFile.exists() && currFile.isDirectory())
			{
				//have an internal count to see if the directory has any valid files
				int filesScannedInDir=0;
				
				try {
					filesScannedInDir+=recursiveFileSearch(currFile);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				filesScanned+=filesScannedInDir;
				
				//display a message if the directory did not have any valid files scanned
				if(filesScannedInDir==0)
				{
					System.out.println ("No valid Files were found in  Directory specified by path: "+ pathString);
				}
				
				//reset the filesScannedInDir counter for any future iterations
			
			}
			else
			{
				throw new IllegalArgumentException("File or Directory specified by path: "+ pathString+" is not found");
			}
		
		 
			}

	}


}
	//method to scan the contents of the file and convert them into tokens 
	//@return returns the list of tokens
	public static ArrayList<Token> ScanFile(File infile) throws FileNotFoundException
	{
		ArrayList<Token> tokens= new ArrayList<Token>();
		FileReader reader=new FileReader(infile);
		TokenStream tokenstream=new TokenStream(reader);
		for(Token tok:tokenstream)
		{
			tokens.add(tok);
			System.out.println("Token stored is: " + tok.getType() +" " + tok.getLexeme()+  tok.getColumnNumber());
		}
		
		
		return tokens;
	}

	
	//Method to display all files within a directory recursively searching 
	//TODO eventually this needs to return files or do more with them
	public static int recursiveFileSearch(File infile) throws FileNotFoundException
	{
		int fileCount=0;
		//if the file is a directory
		if(infile.isDirectory())
		{
			//get the list of all files in the directory
			File[] files =infile.listFiles();
			//loop through each file
			for(File file: files)
			{
				//check if any of the files is a directory
				if(file.isDirectory())
				{
					//if it is call the function recursively
					fileCount+=recursiveFileSearch(file);
				}
				else
				{	
					//follow same procedure as adding a normal file
						String filename=file.toString();
						int index=filename.lastIndexOf('.');
						String extension= filename.substring(index+1);
						System.out.println("Tries to scann tokens");
						ArrayList<Token> tokensInFile=ScanFile(file);
						System.out.println("Scanned tokens");
						if (CppExtensions.contains(extension))
						{
							
							//store filepath to filepatharray & filepathset
							currentFiles.addFilePathArray(filename);
							//display the path to that file
							System.out.println(filename);
							//increment number of files scanned
							fileCount++;
						}

				}
			}
		}
		//currentFiles.printFilePaths();
		return fileCount;
	}
}