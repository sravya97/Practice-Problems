class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        count_s = [0] * 200 
        count_t = [0] * 200
        if len(s) != len(t):
            return False
        for i in range(0, len(s)):
            if count_s[ord(s[i])] != count_t[ord(t[i])]:
                return False
            count_s[ord(s[i])] = i + 1
            count_t[ord(t[i])] = i + 1
        return True