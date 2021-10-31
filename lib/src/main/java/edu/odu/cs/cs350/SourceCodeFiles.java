package edu.odu.cs.cs350;
import java.util.*;

public class SourceCodeFiles {
	
	public SourceCodeFiles() {
	}

	//a sorted set to hold file paths for C++ files (won't allow duplicates!)
	private SortedSet<String> filePathSet = new TreeSet<String>();
	
	//an array of that same set of C++ files
	//private Object filePathArray[] = filePathSet.toArray();
	
	//number of C++ files
	private int numCFiles;
	
	//number of suggestions
	private int numSuggestions;

	
	//add individual C++ file paths to filePathSet
	public void addFilePaths(String... filePaths) {
		for(String i: filePaths) {
			filePathSet.add(i);
		}
		//update number of files
		setNumCFiles(filePathSet.size());
	}

	//print each entry in filePathSet on new line
	public void printFilePaths() {
		Iterator<String> i = filePathSet.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
	
	//print filePathSet array
	/*public void printFilePathsArray() {
		System.out.println(Arrays.toString(filePathArray));
	}
	*/
	//convert filePathSet to string (may be redundant)
	public String fileSetToString() {
		StringBuffer buf = new StringBuffer();
			for (String p: filePathSet) {
	        buf.append(p);
	        buf.append("  ");
		}
	        return buf.toString();
	}

	/**
	 * @return the filePathSet
	 */
	public SortedSet<String> getFilePathSet() {
		return filePathSet;
	}

	/**
	 * @param filePathSet the filePathSet to set
	 */
	public void setFilePathSet(SortedSet<String> filePathSet) {
		this.filePathSet = filePathSet;
	}

	/**
	 * @return the filePathArray
	 *
	public Object[] getFilePathArray() {
		return filePathArray;
	}

	**
	 * @param filePathArray the filePathArray to set
	 *
	public void setFilePathArray(Object[] filePathArray) {
		this.filePathArray = filePathArray;
	}

	**
	 * @return the numCFiles
	 */
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