package com.example;

import java.util.Collections;
import java.util.ArrayList;

public class Tokenizer {
    

    public ArrayList<String> getTokens(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<String>();
        for (String x : list) {
            if (x.length() % 2 == 0) {
                int segs = x.length() / 2;
                int s = 0;
                int e = 2;
                for (int i = 0; i < segs; i++) {
                    String slice = x.substring(s, e);
                    result.add(slice);
                    s += 2;
                    e += 2;
                }
            }
            if (x.length() % 2 != 0) {
                double segs = Math.floor(x.length() / 2) - 1;
                int s = 0;
                int e = 2;
                for (int i = 0; i < segs; i++) {
                    String slice = x.substring(s, e);
                    result.add(slice);
                    s += 2;
                    e += 2;
                }
                result.add(x.substring(x.length() - 3, x.length()));
            }
        }
        Collections.shuffle(result);
        return result;
    }
}

