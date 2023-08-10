package com.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1, 2, 2, 2, 3, 3, 3};

        boolean isUniqueOccurrences = uniqueOccurrences(numbers);
        System.out.println(isUniqueOccurrences);
    }

    private static boolean uniqueOccurrences(int[] numbers) {
        Map<Integer, Integer> uniqueNumbers = new HashMap<>();

        for (int number : numbers) {
            Integer currentValue = uniqueNumbers.putIfAbsent(number, 1);
            if (currentValue != null) {
                uniqueNumbers.put(number, ++currentValue);
            }
        }

        try {
            Set.of(uniqueNumbers.values().toArray());
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }
}
