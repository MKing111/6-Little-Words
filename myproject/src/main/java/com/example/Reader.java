package com.example;
import java.util.ArrayList;

public class Reader {
    
    ArrayList<String> wordList;
    ArrayList<String> hintList;

    public Reader() {
        this.wordList = new ArrayList<String>();
        this.hintList = new ArrayList<String>();
    }

    public int submit(String input, String hint) {
        if (input.length() < 5) {
            throw new IllegalArgumentException("Input must be at least 5 characters.");
        }
        this.wordList.add(input.toUpperCase());
        this.hintList.add(hint);
        return wordList.size();
    }

    public ArrayList<String> getWords() {
        int size = wordList.size();
        int sIndex = Math.max(0, size - 6);

        ArrayList<String> result = new ArrayList<>(wordList.subList(sIndex, size));
        return result;
    }
    
    public ArrayList<String> getClues() {
        int size = hintList.size();
        int sIndex = Math.max(0, size - 6);
        //System.out.print(sIndex);

        ArrayList<String> result = new ArrayList<>(hintList.subList(sIndex, size));
        return result;
    }

}
