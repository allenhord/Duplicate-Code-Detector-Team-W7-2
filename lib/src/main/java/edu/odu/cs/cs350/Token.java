
//This class structure is closely derived from the example given in "jflexdemo" by Steven Zeil https://git.cs.odu.edu/zeil/jflexdemo

package edu.odu.cs.cs350;

public class Token {
	
	/*
	 * token type
	 */
	private TokenKinds type;
	
	/*
	 * lexeme in string form
	 */
	private String lexeme;
	
	/*
	 * column number that token came from
	 */
	
	private int columnNumber;
	
	/*
	 * line number that the token came from
	 */
	private int lineNumber;
	
	/*
	 * Constructor for a specific token
	 */
	public Token (final TokenKinds kindOfToken, final int line, final int column, final String theLexeme)
	{
		type=kindOfToken;
		lexeme=theLexeme;
		columnNumber=column;
		lineNumber=line;
	}
	
	/*
	 * Constructor for a default token with no lexeme
	 */
	public Token (final TokenKinds kindOfToken, final int line, final int column)
	{
		type=kindOfToken;
		lexeme="";
		columnNumber=column;
		lineNumber=line;
	}
	
	//accessor functions
	
	/*
	 * get type
	 * @return the type
	 */
	
	public final TokenKinds getType()
	{
		return type;
	}
	
	/*
	 * get the lexeme of this token
	 * @return the lexeme
	 */
	public final String getLexeme()
	{
		return lexeme;
	}
	
	/*
	 * get line number
	 * @return the line number
	 */
	
	public final int getLineNumber()
	{
		return lineNumber;
	}
	
	/*
	 * get column number
	 * @return the line number
	 */
	
	public final int getColumnNumber()
	{
		return columnNumber;
	}

	
	
}
