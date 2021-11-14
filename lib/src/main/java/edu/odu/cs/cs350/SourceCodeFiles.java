package edu.odu.cs.cs350;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class SourceCodeFiles {

	public SourceCodeFiles() {
	}

	//a sorted set to hold file paths for C++ files (won't allow duplicates!)
	//private SortedSet<String> filePathSet = new TreeSet<String>();

	//an array of that same set of C++ files
	private String[] filePathArray;

	//private Object filePathArray[] = filePathSet.toArray();

	//number of C++ files
	private int numCFiles;

	//number of suggestions
	private int numSuggestions;

	//add element to end of array
	public static String[] addX(int n, String arr[], String x)
	{
		int i;

		// create a new array of size n+1
		String newarr[] = new String[n + 1];

		// insert the elements from
		// the old array into the new array
		// insert all elements till n
		// then insert x at n+1
		for (i = 0; i < n; i++)
			newarr[i] = arr[i];

		newarr[n] = x;

		return newarr;
	}

	//add filepath to filePathArray[]
	public void addFilePathArray(String filepath) {
		File tempFile = new File(filepath);
		boolean fileExists = tempFile.exists();

		if (fileExists) {
			int n = getNumCFiles();
			String absFilepath = tempFile.getAbsolutePath();
			boolean filePresent = false;

			if (this.filePathArray == null) {
			}
			else if (containsFilepath(absFilepath)) {
				//System.out.println(absFilepath + " already in array!");
				filePresent = true;
			}
			if (!filePresent){
				String[] arr = this.filePathArray;
				String x = absFilepath;
				this.filePathArray = addX(n,arr,x);
				//update # of C++ files
				this.setNumCFiles(filePathArray.length);
				//sort array
				Arrays.sort(this.getFilePathArray());
			}
		}
	}
	//update arrayPathSet
	//this.addFilePaths(filepath);

	//print each entry in filePathArray on new line
	public void printFilePathArray() {
		try {
			Arrays.asList(filePathArray).stream().forEach(s -> System.out.println(s));}
		catch (Exception e) {System.out.println("Array is empty!");}
	}
	
	//print individual filePath
	public void printFilePath(int x) {
		try {
			String temp = filePathArray[x];
			System.out.print(temp);
		}
		catch (Exception e) {System.out.println("There's nothing there!");}
	}

	public boolean containsFilepath(String filepath) {
		boolean found = false;
		String searchedValue = filepath;
		String[] stringArray = this.filePathArray;
		for(String x : stringArray){
		    if(x.equals(searchedValue)){
		        found = true;
		        break;
		    }
		}
		return found;
	}
	
	public String getFilePath(int x) {
		return this.filePathArray[x];
	}
	//add C++ file paths to filePathSet
	/*
	public void addFilePaths(String... filePaths) {
		for(String i: filePaths) {
			filePathSet.add(i);
			//update numCFiles
		}
		this.setNumCFiles(filePathSet.size());
	}
	/*
	//print each entry in filePathSet on new line
	public void printFilePaths() {
		Iterator<String> i = filePathSet.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}

	/**
	 * @return the filePathSet

	public SortedSet<String> getFilePathSet() {
		return filePathSet;
	}

	/**
	 * @param filePathSet the filePathSet to set

	public void setFilePathSet(SortedSet<String> filePathSet) {
		this.filePathSet = filePathSet;
	}

	 */

	//return the filePathArray
	public Object[] getFilePathArray() {
		return filePathArray;
	}

	// @param filePathArray the filePathArray to set

	public void setFilePathArray(String[] filePathArray) {
		this.filePathArray = filePathArray;
	}


	//return the numCFiles

	public int getNumCFiles() {
		return numCFiles;
	}

	/**
	 * @param numCFiles the numCFiles to set
	 */
	public void setNumCFiles(int numCFiles) {
		this.numCFiles = numCFiles;
	}

	/**
	 * @return the numSuggestions
	 */
	public int getNumSuggestions() {
		return numSuggestions;
	}

	/**
	 * @param numSuggestions the numSuggestions to set
	 */
	public void setNumSuggestions(int numSuggestions) {
		this.numSuggestions = numSuggestions;
	}
}