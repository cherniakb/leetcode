package com.problem;

import java.util.Map;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

public class Application {
    public static void main(String[] args) {
        String romanNumber = "VIII";
        int intNum = romanToInt(romanNumber);
        System.out.println(intNum);
    }

    private final static Map<Character, Integer> ROMAN_INT_MATRIX = ofEntries(
        entry('I', 1),
        entry('V', 5),
        entry('X', 10),
        entry('L', 50),
        entry('C', 100),
        entry('D', 500),
        entry('M', 1000)
    );

    private static int romanToInt(String romanNumber) {
        char[] chars = romanNumber.toCharArray();
        int total = 0;
        for (int i = 0; i < romanNumber.length() - 1; i++) {
            char current = chars[i];
            char next = chars[i + 1];
            int currentInt = ROMAN_INT_MATRIX.get(current);
            if (ROMAN_INT_MATRIX.get(current) < ROMAN_INT_MATRIX.get(next)) {
                total -= currentInt;
            } else {
                total += currentInt;
            }
        }
        return total + ROMAN_INT_MATRIX.get(chars[romanNumber.length() - 1]);

    }

}
