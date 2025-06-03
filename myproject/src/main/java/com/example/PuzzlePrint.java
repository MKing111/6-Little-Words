package com.example;

import java.util.ArrayList;

public class PuzzlePrint {
    ArrayList<String> tokens;
    ArrayList<String> clues;
    ArrayList<String> key;

    public PuzzlePrint(ArrayList<String> tokens, ArrayList<String> clues, ArrayList<String> key) {
        this.tokens = tokens;
        this.clues = clues;
        this.key = key;
    }

    public void printTokens() {
        System.out.println("Tokens");
        if (this.tokens.size() % 4 == 0) {
            if (this.tokens.size() == 12) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
            }
            if (this.tokens.size() == 16) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(12), this.tokens.get(13),
                        this.tokens.get(14), this.tokens.get(15));
            }
            if (this.tokens.size() == 20) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(12), this.tokens.get(13),
                        this.tokens.get(14), this.tokens.get(15));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(16), this.tokens.get(17),
                        this.tokens.get(18), this.tokens.get(19));
            }
        }
        if (this.tokens.size() % 4 == 1) {
            if (this.tokens.size() == 13) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s%n", this.tokens.get(12));
            }
            if (this.tokens.size() == 17) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(12), this.tokens.get(13),
                        this.tokens.get(14), this.tokens.get(15));
                System.out.printf("%-10s%n", this.tokens.get(16));
            }
            if (this.tokens.size() == 21) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(12), this.tokens.get(13),
                        this.tokens.get(14), this.tokens.get(15));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(16), this.tokens.get(17),
                        this.tokens.get(18), this.tokens.get(19));
                System.out.printf("%-10s%n", this.tokens.get(20));
            }
        }
        if (this.tokens.size() % 4 == 2) {
            if (this.tokens.size() == 10) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s%n", this.tokens.get(8), this.tokens.get(9));
            }
            if (this.tokens.size() == 14) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s%n", this.tokens.get(12), this.tokens.get(13));
            }
            if (this.tokens.size() == 18) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(12), this.tokens.get(13),
                        this.tokens.get(14), this.tokens.get(15));
                System.out.printf("%-10s %-10s%n", this.tokens.get(16), this.tokens.get(17));
            }
            if (this.tokens.size() == 22) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(12), this.tokens.get(13),
                        this.tokens.get(14), this.tokens.get(15));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(16), this.tokens.get(17),
                        this.tokens.get(18), this.tokens.get(19));
                System.out.printf("%-10s %-10s%n", this.tokens.get(20), this.tokens.get(21));
            }
        }
        if (this.tokens.size() % 4 == 3) {
            if (this.tokens.size() == 11) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9), this.tokens.get(10));
            }
            if (this.tokens.size() == 15) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s %-10s%n", this.tokens.get(12), this.tokens.get(13), this.tokens.get(14));
            }
            if (this.tokens.size() == 19) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(12), this.tokens.get(13),
                        this.tokens.get(14), this.tokens.get(15));
                System.out.printf("%-10s %-10s %-10s%n", this.tokens.get(16), this.tokens.get(17), this.tokens.get(18));
            }
            if (this.tokens.size() == 23) {
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(0), this.tokens.get(1),
                        this.tokens.get(2), this.tokens.get(3));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(4), this.tokens.get(5),
                        this.tokens.get(6), this.tokens.get(7));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(8), this.tokens.get(9),
                        this.tokens.get(10), this.tokens.get(11));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(12), this.tokens.get(13),
                        this.tokens.get(14), this.tokens.get(15));
                System.out.printf("%-10s %-10s %-10s %-10s%n", this.tokens.get(16), this.tokens.get(17),
                        this.tokens.get(18), this.tokens.get(19));
                System.out.printf("%-10s %-10s %-10s%n", this.tokens.get(20), this.tokens.get(21), this.tokens.get(22));
            }
        }
    }

    public void printClues() {
        System.out.println("Clues");
        for (String x : this.clues) {
            System.out.println(x);
        }
    }

    public void printAnswers() {
        System.out.println("Answer Key");
        for (String x : this.key) {
            System.out.println(x);
        }
    }
}
