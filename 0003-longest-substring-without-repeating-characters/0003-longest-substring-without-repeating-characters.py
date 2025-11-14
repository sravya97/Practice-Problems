class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = 0
        result = 0
        counter = 0
        char_set = set()
        for i in range(len(s)):
            ch = s[i]
            while ch in char_set:
                char_set.remove(s[start])
                start = start + 1
            
            char_set.add(ch)
            result = max(result, i - start + 1)
        return result