package Array;

public class _122_BuyTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = buy + 1;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy < prices.length && prices[buy] < prices[sell]) {
                profit += (prices[sell] - prices[buy]);
            }
            buy++;
            sell++;
        }
        return profit;
    }
}
