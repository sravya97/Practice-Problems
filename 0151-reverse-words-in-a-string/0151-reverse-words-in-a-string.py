class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split(" ")
        answer = ""
        for i in range(len(words)-1,-1, -1):
            if words[i]:
                answer = answer + words[i] + " "
        return answer.strip()