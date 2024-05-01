class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return [[]]
        
        if numRows == 1:
            return [[1]]
        
        result = self.generate(numRows-1)
        prev = result[-1]
        curr = []
        curr.append(1)
        for i in range(1, numRows-1):
            curr.append(prev[i-1] + prev[i])
        curr.append(1)
        result.append(curr)
        return result
        
        