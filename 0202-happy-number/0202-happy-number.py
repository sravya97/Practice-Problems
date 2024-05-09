class Solution:
    def isHappy(self, n: int) -> bool:
        def getSquaresSum(num):
            sums = 0
            while num > 0:
                rem = num % 10
                sums = sums + (rem * rem)
                num = num // 10
            return sums
            
        slow = n
        fast = n
        while True:
            slow = getSquaresSum(slow)
            fast = getSquaresSum(getSquaresSum(fast))

            if slow == 1 or slow == fast:
                break
        if slow == 1:
            return True
        else:
            return False
            