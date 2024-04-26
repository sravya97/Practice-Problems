class Solution:
    def findLatestTime(self, s: str) -> str:
        output = ""
        if s[0] == "?" and s[1] == "?":
            output += "11"
        elif s[0] == "?" and s[1] > "1":
            output = output + "0" + s[1]
        elif s[0] == "?":
            output = output + "1" + s[1]
        elif s[0] == "0" and s[1] == "?":
            output += "09"
        elif s[0] == "1" and s[1] == "?":
            output += "11"
        else:
            output = output + s[0] + s[1]
        output += ":"
        if s[3] == "?":
            output += "5"
        else:
            output += s[3]
        if s[4] == "?":
            output += "9"
        else:
            output += s[4]
        return output
            
        