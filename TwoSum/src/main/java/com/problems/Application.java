package com.problems;

import java.util.Arrays;
import java.util.List;

public class Application {

    public int[] twoSum(int[] nums, int target) {
        List<Integer> numsList = Arrays.stream(nums).boxed().toList();
        int[] result = new int[2];
        for (int i = 0; i < numsList.size(); i++) {
            Integer currentNum = numsList.get(i);
            result[0] = i;
            int secondPossibleIndex = numsList.indexOf(target - currentNum);
            if (secondPossibleIndex == i) continue;
            if (secondPossibleIndex != -1) {
                result[1] = secondPossibleIndex;
                break;
            }
        }
        return result;
    }
}
