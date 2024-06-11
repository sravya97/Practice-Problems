class Solution:
    def countBits(self, n: int) -> List[int]:
        result = [0] * (n+1)
        offset = 1
        for i in range(1,n+1):
            if i == offset * 2:
                offset = offset * 2
            result[i] = result[i-offset] + 1
        return result