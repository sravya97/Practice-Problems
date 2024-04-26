class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        lower = [0] * 26
        upper = [0] * 26
        for ch in word:
            val = ord(ch) - ord('a')
            if val < 0:
                val = ord(ch) - ord('A')
                upper[val] += 1
            else:
                lower[val] += 1
        result = 0
        for i in range(0,26):
            if lower[i] > 0 and upper[i] > 0:
                result += 1
        return result
                
        