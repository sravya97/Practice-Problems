class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        def backtrack(remaining, index, curr):
            if remaining == 0 and len(curr) > 0:
                result.append(curr.copy())
                return
            if remaining < 0:
                return
            for i in range(index, len(candidates)):
                if i > index and candidates[i] == candidates[i-1]:
                    continue
                curr.append(candidates[i])
                backtrack(remaining - candidates[i], i+1, curr)
                curr.pop()
        candidates.sort()
        backtrack(target, 0, [])
        return result
            