package com.problems;

import jdk.jfr.Label;

import java.util.LinkedHashMap;
import java.util.List;

public class Application {
    public boolean isSubsequence(String s, String t) {
        char[] charArray = s.toCharArray();

        if (!s.equals(t) && s.length() == t.length()) {
            return false;
        }

        int position;
        for (char c : charArray) {
            position = t.indexOf(c);
            if (position == -1) {
                return false;
            }
            t = t.substring(position + 1);
        }
        return true;
    }
}
