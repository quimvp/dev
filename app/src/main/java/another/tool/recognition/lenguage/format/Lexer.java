package another.tool.recognition.lenguage.format;

import java.util.ArrayList;
import java.util.List;

import static com.java.components.Prints.*;
import com.java.components.util.function.*;

public class Lexer {
    private final String input;
    private int pos;
    private char currentChar;
    private final List<Token> tokens;
    private QuinFunction<Character, Character, Character, Integer, String, Token> customTokenizer;

    public Lexer(String input) {
        this.input = input;
        this.pos = 0;
        this.tokens = new ArrayList<>();
        this.customTokenizer = null;
        this.currentChar = input.charAt(pos);
    }

    public void setTokenizer(QuinFunction<Character, Character, Character, Integer, String, Token> customTokenizer) { this.customTokenizer = customTokenizer; }

    public void next() {
        advance();
    }

    public void previou() {
        retreat();
    }

    private void advance() {
        pos++;
        if (pos >= input.length()) {
            currentChar = '\0';
        } else {
            currentChar = input.charAt(pos);
        }
    }

    private void retreat() {
        pos--;
        if (pos <= 0) {
            currentChar = '\0';
        } else {
            currentChar = input.charAt(pos);
        }
    }

    private void skipWhitespace() {
        while (currentChar != '\0' && Character.isWhitespace(currentChar)) {
            advance();
        }
    }

    private Token number() {
        StringBuilder result = new StringBuilder();
        while (currentChar != '\0' && Character.isDigit(currentChar)) {
            result.append(currentChar);
            advance();
        }
        return new Token(result.toString(), TypeToken.NumberToken);
    }

    private Token identifier() {
        StringBuilder result = new StringBuilder();
        while (currentChar != '\0' && Character.isLetter(currentChar)) {
            result.append(currentChar);
            advance();
        }
        return new Token(result.toString(), TypeToken.IdentifierToken);
    }

    private char nextCharacter() {
        int pos2 = this.pos;
        char currentChar;
        pos2++;
        if (pos2 >= input.length()) {
            currentChar = '\0';
        } else {
            currentChar = input.charAt(pos2);
        }
        return currentChar;
    }

    private char retreatCharacter() {
        int pos2 = this.pos;
        char currentChar;
        pos2--;
        if (pos2 <= 0) {
            currentChar = '\0';
        } else {
            currentChar = input.charAt(pos2);
        }
        return currentChar;
    }

    public List<Token> tokenize() {
        while (currentChar != '\0') {
            if (Character.isWhitespace(currentChar)) {
                skipWhitespace();
                continue;
            }
            if (Character.isLetter(currentChar)) {
				tokens.add(identifier());
                continue;
            }
            if (Character.isDigit(currentChar)) {
                tokens.add(number());
                continue;
            }
            if (customTokenizer != null) {
                Token customToken = customTokenizer.apply(currentChar, nextCharacter(), retreatCharacter(), pos, input);
                if (customToken != null) {
                    tokens.add(customToken);
                    advance();
                    continue;
                }
            }
            throw new RuntimeException("Unexpected character: " + currentChar);
        }
        tokens.add(new Token("", TypeToken.EOF));
        return tokens;
    }
}
