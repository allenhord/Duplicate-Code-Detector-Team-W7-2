package edu.odu.cs.cs350;

public class DupDetector {

	public static void main(int nSuggestions, String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		SourceCodeFiles currentSourceCodeFiles = new SourceCodeFiles();
		
		System.out.println(args);
		
		currentSourceCodeFiles.addFilePaths(args);
		currentSourceCodeFiles.setNumSuggestions(nSuggestions);
		
		
		currentSourceCodeFiles.printFilePaths();

	}

}
