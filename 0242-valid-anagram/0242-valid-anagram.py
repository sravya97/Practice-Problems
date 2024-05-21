class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        list1 = [0] * 26
        list2 = [0] * 26
        for ch in s:
            list1[ord(ch) - ord('a')] += 1
        for ch in t:
            list2[ord(ch) - ord('a')] += 1
        
        for i in range(0, 26):
            if list1[i] != list2[i]:
                return False
        return True
            