package com.problems;

public class Application {
    public static int maxProfit(int[] prices) {
        int lowestBuyPrice = prices[0];
        int bestSellPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == 0) {
                continue;
            }

            int price = prices[i];
            if (lowestBuyPrice > price && i != prices.length - 1) {
                lowestBuyPrice = price;
                bestSellPrice = price;
            }
            if (bestSellPrice < price) {
                bestSellPrice = price;
            }
        }
        return bestSellPrice - lowestBuyPrice;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 6, 5, 0, 3};
        int profit = maxProfit(nums);
        System.out.println(profit);

    }
}
