class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        result = []
        def recursives(opened, closed, current):
            if opened == n and closed == n:
                result.append(current)
                return
            if opened < n:
                recursives(opened+1, closed, current + "(")
            if opened > closed:
                recursives(opened, closed + 1, current + ")")
            return
        recursives(0,0, "")
        return result
            
            
        