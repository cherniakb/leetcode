package com.problems;

import java.util.Arrays;

public class Application {
    public static int pivotIndex(int[] nums) {
        int tempLeftShiftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            tempLeftShiftSum += nums[i];
            int[] rightShiftNums = Arrays.copyOfRange(nums, i, nums.length);
            int rightShiftSum = Arrays.stream(rightShiftNums).sum();

            if (tempLeftShiftSum == rightShiftSum) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 7, 3, 6, 5, 6};
        pivotIndex(a);
    }
}
