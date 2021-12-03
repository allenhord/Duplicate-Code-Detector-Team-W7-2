package edu.odu.cs.cs350;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;



public class TestSourceCodeFiles{
	
	@Test
	public void testAddFilePaths() {
		/*
		SourceCodeFiles m = new SourceCodeFiles();
		assertThat(m.getNumCFiles(), is(0));
		m.addFilePathArray("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someCppFile.cpp");
		assertThat(m.getNumCFiles(), is(1));
		assertTrue(m.containsFilepath("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someCppFile.cpp"));
	
		m.addFilePathArray("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someHeaderFile.h");
		assertThat(m.getNumCFiles(), is(2));
		assertTrue(m.containsFilepath("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someHeaderFile.h"));
		//try to add non-existent file
		m.addFilePathArray("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\DNE.cpp");
		assertThat(m.getNumCFiles(), is(2));
		assertFalse(m.containsFilepath("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\DNE.cpp"));
		//redundant addition
		m.addFilePathArray("C:\\Users\\allen\\git\\Duplicate-Code-Detector-Team-W7-2\\lib\\src\\test\\data\\DupDetectorTestDirectory\\someHeaderFile.h");
		assertThat(m.getNumCFiles(), is(2));
			*/
	}
	
	@Test
	public void testNumSuggestions() {
		SourceCodeFiles m = new SourceCodeFiles();
		m.setNumSuggestions(10);
		assertThat(m.getNumSuggestions(), is (10));
	
	}
	
}