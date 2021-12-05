/**
 * 
 */
package edu.odu.cs.cs350;

import static org.junit.jupiter.api.Assertions.*;


import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;

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
		String path = "lib/src/test/data";
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
		try {
			filesFound=DupDetector.recursiveFileSearch(dirFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			try {
				filesFoundInEmptyDir=DupDetector.recursiveFileSearch(dirFile2);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("File path : "+ dirFile2.isDirectory()+dirFile2.getAbsolutePath());
			System.out.println("Files scanned: "+ filesFoundInEmptyDir );
			assertTrue(filesFoundInEmptyDir==filecount2);
		
		
	}
	
	
	@Test
	//testing the ScanFile method in DupDector class  
	// It should accurately convert a file into tokens 
	public void testFileScan() {
		String cppFilePath = "lib/src/test/data/DupDetectorTestDirectory/someCppFile.cpp";
		File cppFile=new File(cppFilePath);
		//list of tokens
		ArrayList<Token> tokens= new ArrayList<Token>();
		//run this function to store the tokens in that cpp file
		try {
			tokens=DupDetector.ScanFile(cppFile);
		} catch (FileNotFoundException e) {
			System.out.println("File was not found");
		}
		
		assertEquals(17,tokens.size());
		Token t= tokens.get(0);
		System.out.println("Token scanned in 0 index: "+tokens.get(0).getType() + " "+tokens.get(0).getLexeme());
		assertEquals(TokenKinds.KEYWORD, t.getType());
		assertEquals("typename", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(1,t.getColumnNumber());
		
	    t= tokens.get(1);
		assertEquals(TokenKinds.INTEGER_LITERAL, t.getType());
		assertEquals("12341239", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(11,t.getColumnNumber());
		
		
	    t= tokens.get(2);
		assertEquals(TokenKinds.IDENTIFIER, t.getType());
		assertEquals("identif_check", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(20,t.getColumnNumber());
		
	    t= tokens.get(3);
		assertEquals(TokenKinds.ACCESS_MODIFIER, t.getType());
		assertEquals("public", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(34,t.getColumnNumber());
		
	    t= tokens.get(4);
		assertEquals(TokenKinds.LITERAL, t.getType());
		assertEquals("false", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(41,t.getColumnNumber());
		
		t= tokens.get(5);
		assertEquals(TokenKinds.STRING_LITERAL, t.getType());
		assertEquals("\"this is a string\"", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(47,t.getColumnNumber());
		
		
	    t= tokens.get(6);
		assertEquals(TokenKinds.CLASS_DEF, t.getType());
		assertEquals("class", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(66,t.getColumnNumber());
		
	    t= tokens.get(7);
		assertEquals(TokenKinds.VIRT_SPECIFIER, t.getType());
		assertEquals("final", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(72,t.getColumnNumber());
		
	    t= tokens.get(8);
		assertEquals(TokenKinds.QUALIFIER, t.getType());
		assertEquals("const", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(78,t.getColumnNumber());

	    t= tokens.get(9);
		assertEquals(TokenKinds.UNARY_OPERATOR, t.getType());
		assertEquals("++", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(84,t.getColumnNumber());
		
		
	    t= tokens.get(10);
		assertEquals(TokenKinds.ASSIGNMENT, t.getType());
		assertEquals("+=", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(87,t.getColumnNumber());
		
	    t= tokens.get(11);
		assertEquals(TokenKinds.PM_OPERATOR, t.getType());
		assertEquals(".*", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(90,t.getColumnNumber());
		
	    t= tokens.get(12);
		assertEquals(TokenKinds.SHIFT_OPERATOR, t.getType());
		assertEquals(">>", t.getLexeme());
		assertEquals(5, t.getLineNumber());
		assertEquals(93,t.getColumnNumber());
		
		t= tokens.get(13);
		assertEquals(TokenKinds.RL_OPERATOR, t.getType());
		assertEquals("==", t.getLexeme());
		assertEquals(6, t.getLineNumber());
		assertEquals(1,t.getColumnNumber());
		
		
	    t= tokens.get(14);
		assertEquals(TokenKinds.ARITHMETIC_OPERATOR, t.getType());
		assertEquals("-", t.getLexeme());
		assertEquals(6, t.getLineNumber());
		assertEquals(4,t.getColumnNumber());
		
	    t= tokens.get(15);
		assertEquals(TokenKinds.OVERLOADED_LEXEME, t.getType());
		assertEquals("&", t.getLexeme());
		assertEquals(6, t.getLineNumber());
		assertEquals(6,t.getColumnNumber());
		
	    t= tokens.get(16);
		assertEquals(TokenKinds.SEPARATOR, t.getType());
		assertEquals("->", t.getLexeme());
		assertEquals(6, t.getLineNumber());
		assertEquals(8,t.getColumnNumber());
	
	}
	
	
	
	@Test
	//testing the ScanFile method in DupDector class  
	// It should accurately convert a file into tokens 
	public void testNumberSuggstionCheck() {
		//create an array of arguments

		String negativeargs[]= {"-1","2","string","0","1.23"};

		assertFalse(DupDetector.numberSuggstionCheck(negativeargs[0]));
		assertTrue(DupDetector.numberSuggstionCheck(negativeargs[1]));
		assertFalse(DupDetector.numberSuggstionCheck(negativeargs[2]));
		assertFalse(DupDetector.numberSuggstionCheck(negativeargs[3]));
		assertFalse(DupDetector.numberSuggstionCheck(negativeargs[4]));
		
	}
	
	@Test
	//testing the optional properties .ini file
	public void testPropertiesFile() {
		assertEquals(10, DupDetector.MinSequenceLength);
		assertEquals(8, DupDetector.MaxSubstitutions);
		
		String iniFilePath = "lib/src/test/data/DupDetectorTestDirectory/propertiesFile.ini";
		String dneFilePath = "lib/src/test/data/DupDetectorTestDirectory/dnePropertiesFile.ini";
		String illegalFilePath = "lib/src/test/data/DupDetectorTestDirectory/illegalPropertiesFile.ini";
		
		
		assertTrue(DupDetector.iniParse(iniFilePath));
		assertFalse(DupDetector.iniParse(dneFilePath));
		assertFalse(DupDetector.iniParse(illegalFilePath));
		
		DupDetector.iniParse(iniFilePath);

		
		assertTrue(DupDetector.CppExtensions.contains("C"));
		assertTrue(DupDetector.CppExtensions.contains("cpp"));
		assertTrue(DupDetector.CppExtensions.contains("h"));
		assertTrue(DupDetector.CppExtensions.contains("hpp"));
		assertTrue(DupDetector.CppExtensions.contains("H"));
		
		assertEquals(27, DupDetector.MinSequenceLength);
		assertEquals(33, DupDetector.MaxSubstitutions);
		
		
	}

}
