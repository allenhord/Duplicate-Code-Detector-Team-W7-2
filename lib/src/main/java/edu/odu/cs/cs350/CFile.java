package edu.odu.cs.cs350;

public class CFile {

	private String absoluteFilePath;
	
	private int numTokens;
	
	private int rank;
	
	public CFile() {
	}
	
	public CFile(String path) {
		this.absoluteFilePath = path;
	}
	
	public void setAbsoluteFilePath(String path) {
		this.absoluteFilePath = path;
	}
	
	public String getAbsoluteFilePath() {
		return this.absoluteFilePath;
	}
	//order of CFile in array
	public void setRank(int x) {
		this.rank = x;
	}
	
	public int getRank() {
		return rank;
	}
	
	public void setNumTokens(int x) {
		this.numTokens = x;
	}
	
	public int getNumTokens() {
		return numTokens;
	}
}
