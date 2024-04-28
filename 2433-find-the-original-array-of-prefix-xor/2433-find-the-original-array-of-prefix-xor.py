class Solution:
    def findArray(self, pref: List[int]) -> List[int]:
        origin = []
        origin.append(pref[0])
        for i in range(1, len(pref)):
            origin.append(pref[i] ^ pref[i-1])
        return origin
        