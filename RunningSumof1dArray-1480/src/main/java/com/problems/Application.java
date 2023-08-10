package com.problems;

public class Application {
    public static int[] runningSum(int[] nums) {
        int tempSum = 0;
        int[] result = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] + tempSum;
            tempSum += nums[i];
        }
        return result;
    }
}
