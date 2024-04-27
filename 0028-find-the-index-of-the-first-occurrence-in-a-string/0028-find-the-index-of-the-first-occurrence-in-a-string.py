class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        left = 0
        needleLength = len(needle)
        while left + needleLength - 1 < len(haystack):
            sub = haystack[left : left + needleLength]
            if sub == needle:
                return left
            else:
                left += 1
        return -1