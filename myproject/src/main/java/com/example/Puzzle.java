package com.example;
import java.util.ArrayList;

public class Puzzle {

    public static void main(String[] args) {
        Reader r = new Reader();
        r.submit("printer", "Device made to waste ink and paper");
        r.submit("elephant", "Large animal with signature trunk and ears");
        r.submit("guitar", "Strum it or pluck it to make music");
        r.submit("umbrella", "Protection from rain");
        r.submit("computer", "High-speed time wasting calculating machine");
        r.submit("penguin", "Formally dressed flightless bird");
        ArrayList<String> clues = r.getClues();
        ArrayList<String> words = r.getWords();
        System.out.println(clues);
        /* 
        Reader r = new Reader();
        r.submit("printer", "Device made to waste ink and paper");
        r.submit("elephant","Large animal with signature trunk and ears");
        r.submit("guitar","Strum it or pluck it to make music");
        r.submit("umbrella","Protection from rain");
        r.submit("computer","High-speed time wasting calculating machine");
        r.submit("penguin","Formally dressed flightless bird");
        Tokenizer t = new Tokenizer();
        ArrayList<String> tokens = t.getTokens(r.wordList);
        PuzzlePrint p = new PuzzlePrint(tokens, r.hintList, r.wordList);
        p.printTokens();
        p.printClues();
        p.printAnswers();*/
    }
}

