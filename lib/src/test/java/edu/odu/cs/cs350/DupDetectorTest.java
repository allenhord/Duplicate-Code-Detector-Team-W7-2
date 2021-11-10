/**
 * 
 */
package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;


import java.io.File;

import org.junit.jupiter.api.Test;




/**
 * @author Alex
 *
 */
public class DupDetectorTest {

	@Test
	//testing the main function
	public void testMain() {

		System.out.println("Not yet implemented");;
		
	}
	
	@Test
	//testing the DirRecursion method in DupDector class for correctness 
	// It should accurately count the .cpp and.h files
	public void testDirRecursion() {
		//create the path to the resources folder
		String path = "src/test/data";
		File dirFile= new File(path);
		//create the file directory
		//and add extensions to check for valid 
		DupDetector.CppExtensions.add("cpp");
		DupDetector.CppExtensions.add("h");
		//resources folder has 4 valid cpp and h files in total
		int filecount=4;
		//display the absolute path of the folder
		System.out.println("File path : "+ dirFile.isDirectory()+dirFile.getAbsolutePath());
		//set the initial count to 0
		int filesFound=0;
		//call the method to find the files
		filesFound=DupDetector.recursiveFileSearch(dirFile);
		//display the number of files scanned
		System.out.println("Files scanned: "+filesFound);
		//check that the number of files found is the same as 4
		assertTrue(filesFound==filecount);
		
		//checks empty directory
		
		//create the path to the empty directory folder
				String path2 = "src/test/data/DupDetectorTestDirectory/EmptyDirectory";
				File dirFile2= new File(path2);
			int filecount2=0;
			int filesFoundInEmptyDir=0;
			filesFoundInEmptyDir=DupDetector.recursiveFileSearch(dirFile2);
			System.out.println("File path : "+ dirFile2.isDirectory()+dirFile2.getAbsolutePath());
			System.out.println("Files scanned: "+ filesFoundInEmptyDir );
			assertTrue(filesFoundInEmptyDir==filecount2);
		
		
	}

}
