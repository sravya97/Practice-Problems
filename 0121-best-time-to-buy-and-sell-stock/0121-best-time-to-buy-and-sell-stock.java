class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy, prices[i]);
            result = Math.max(prices[i] - buy, result);
        }
        return result;
    }
}