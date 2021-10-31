/**
 * 
 */
package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;


import java.io.File;


import org.junit.Test;

/**
 * @author Alex
 *
 */
public class DupDetectorTest {

	@Test
	public void testMain() {
		System.out.println("Not yet implemented");;
	}
	
	@Test
	public void testDirRecursion() {
		String path = "src/test/resources";
		File dirFile= new File(path);
		DupDetector.CppExtensions.add("cpp");
		DupDetector.CppExtensions.add("h");
		int filecount=4;
		System.out.println("File path : "+ dirFile.isDirectory()+dirFile.getAbsolutePath());
		int filesFound=0;
		filesFound=DupDetector.recursiveFileSearch(dirFile);
		System.out.println("Files scanned: "+filesFound);
		assertTrue(filesFound==filecount);
		
		
	}

}
