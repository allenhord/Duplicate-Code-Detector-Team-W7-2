package edu.odu.cs.cs350;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class TestSourceCodeFiles{
	
	@Test
	public void testAddFilePaths() {
		SourceCodeFiles m = new SourceCodeFiles();
		assertThat(m.getNumCFiles(), is(0));

		m.addFilePathArray("/roll.cpp");
		
		assertThat(m.getFilePathArray(), hasItemInArray("/roll.cpp"));		
		assertThat(m.getNumCFiles(), is(1));
		
		m.addFilePathArray("/roll.cpp");
		assertThat(m.getNumCFiles(), is(1));	
		
		m.addFilePathArray("/fizzlebeef.h");
		assertThat(m.getFilePathArray(), hasItemInArray("/fizzlebeef.h"));		
		assertThat(m.getNumCFiles(), is(2));
		
	}
	
	@Test
	public void testNumSuggestions() {
		SourceCodeFiles m = new SourceCodeFiles();
		m.setNumSuggestions(10);
		assertThat(m.getNumSuggestions(), is (10));
	
	}
}