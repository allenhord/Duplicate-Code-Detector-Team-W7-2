package edu.odu.cs.cs350;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;


public class TestCFile {
	
	@Test
	public void testSetRank() {
		CFile c0 = new CFile();
		CFile c1 = new CFile("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someCppFile.cpp");
		
		c0.setRank(0);
		c1.setRank(1);
		
		assertThat(c0.getRank(), is(0));
		assertThat(c1.getRank(), is(1));
	}
	
	@Test
	public void testSetNumTokens() {
		CFile c0 = new CFile();
		CFile c1 = new CFile("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someCppFile.cpp");

		c0.setNumTokens(8);
		c1.setNumTokens(42);
		
		assertThat(c0.getNumTokens(), is(8));
		assertThat(c1.getNumTokens(), is(42));
	}

	@Test
	public void testSetAbsoluteFilePath() {
		CFile c0 = new CFile();
		c0.setAbsoluteFilePath("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someCppFile.cpp");
		
		CFile c1 = new CFile("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someCppFile.cpp");
		c1.setAbsoluteFilePath("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someHeaderFile.h");
		
		assertThat(c0.getAbsoluteFilePath(), is("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someCppFile.cpp"));
		assertThat(c1.getAbsoluteFilePath(), is("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someHeaderFile.h"));
	}
}
