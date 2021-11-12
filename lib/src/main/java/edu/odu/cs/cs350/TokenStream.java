//This class structure is closely derived from the example given in "jflexdemo" by  Steven Zeil https://git.cs.odu.edu/zeil/jflexdemo

package edu.odu.cs.cs350;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class TokenStream implements Iterable<Token>{

	/*
	 * the list of tokens taken from a scanner
	 */
	private List<Token> tokens;
	
   
    public TokenStream(final Reader input) {
        tokens = new LinkedList<Token>();
        jflexScanner scanner = new jflexScanner (input);
        try {
            Token token = scanner.yylex();
            while (token != null && token.getType() != TokenKinds.EOF) {
                tokens.add (token);
                token = scanner.yylex();
            }
        } catch (IOException ex) {
            // Not necessarily a problem, depending on the input source
        }
    }
        
        /**
         * Return an iterator over the list of tokens.
         * @return iterator
         */
        @Override
        public final Iterator<Token> iterator() {
            return tokens.iterator();
        }

}
