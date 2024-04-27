class Solution:
    def romanToInt(self, s: str) -> int:
        curr = 0
        prev = 0
        result = 0
        for ch in reversed(s):
            if ch == 'I':
                curr = 1
            elif ch == 'V':
                curr = 5
            elif ch == 'X':
                curr = 10
            elif ch == 'L':
                curr = 50
            elif ch == 'C':
                curr = 100
            elif ch == 'D':
                curr = 500
            elif ch == 'M':
                curr = 1000
            if curr < prev:
                result -= curr
            else:
                result += curr
            prev = curr
        return result
        