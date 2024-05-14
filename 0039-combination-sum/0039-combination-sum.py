class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        def backtrack(current, remain, start):
            if remain == 0:
                result.append(current.copy())
            elif remain < 0:
                return
            else:
                for i in range(start, len(candidates)):
                    current.append(candidates[i])
                    backtrack(current, remain-candidates[i], i)
                    current.pop()
        backtrack([], target, 0)
        return result