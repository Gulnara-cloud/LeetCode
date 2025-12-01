public class L_122_BestTimeToBuyAndSellStockll {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] result = {7, 1, 5, 3, 6, 4};
        int[] result1 = {1, 2, 3, 4, 5};
        int[] result2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(result));
        System.out.println(maxProfit(result1));
        System.out.println(maxProfit(result2));
    }
}