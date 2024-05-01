import sys
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        buy = sys.maxsize
        for i in range(0, len(prices)):
            buy = min(buy, prices[i])
            profit = max(profit, prices[i] - buy)
        return profit