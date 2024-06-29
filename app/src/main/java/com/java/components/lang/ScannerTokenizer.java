package com.java.components.lang;


import java.util.*;

public class ScannerTokenizer {
    public String[][] tokens;
    private int currentPositionLines;
    private int currentPositionTokens;

    public ScannerTokenizer(String text) {
        this(text, " ");
    }

    private ScannerTokenizer(String text, String delimiter) {
        StringBuilder delimiterBuilder = new StringBuilder();
        if(delimiter.length() > 1) {
            for(int i = 0; i < delimiter.length(); i++)
              if(!(delimiter.charAt(i) == '\n' && delimiter.charAt(i) == '\r'))
                delimiterBuilder.append(delimiter.charAt(i) + "|");
              else if(delimiter.charAt(i) == '\n' && delimiter.charAt(i) == '\r')
                i++;
        }
        if(delimiterBuilder.length() > 2)
            delimiterBuilder.delete(delimiterBuilder.length() - 1, delimiterBuilder.length());
        delimiter = delimiterBuilder.toString();
        String[] lines = text.split("\r?\n");
        List<List<String>> subTokens = new ArrayList<>();
        for(String line : lines) {
            List<String> words = Arrays.asList(line.split(delimiter));
            subTokens.add(words);
        }
        tokens = new String[subTokens.size()][];
        for (int i = 0; i < subTokens.size(); i++) {
            List<String> row = subTokens.get(i);
            tokens[i] = row.toArray(new String[0]);
        }
    }

    public java.lang.Boolean hashNext() {
        return currentPositionLines < tokens.length;
    }
    
    public String nextToken() {
        if(currentPositionLines >= tokens.length) {
            return null;
        }
        while(currentPositionTokens == tokens[currentPositionLines].length) {
            currentPositionTokens = 0;
            currentPositionLines++;
            if(currentPositionLines >= tokens.length) {
                return null;
            }
        }
        return tokens[currentPositionLines][currentPositionTokens++];
    }
    
    public String nextLine() {
        if(currentPositionLines >= tokens.length) {
            return null;
        }
        StringBuilder lineBuilder = new StringBuilder();
        currentPositionTokens = tokens[currentPositionLines].length;
        while(currentPositionTokens == tokens[currentPositionLines].length) {
            currentPositionTokens = 0;
            currentPositionLines++;
        }
        lineBuilder.append(tokens[currentPositionLines][currentPositionTokens]);
        currentPositionTokens = 0;
        return lineBuilder.toString().trim();
    }

    public Integer nextTokenNumber() {
        Integer num = 0;
        while (hashNext()) {
            String t = nextToken();
            if(t.matches("\\d+")) num = Integer.valueOf(t);
        }
        return num;
    }
}
