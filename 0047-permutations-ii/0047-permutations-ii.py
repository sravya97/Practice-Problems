class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()
        def backtrack(used, current):
            if len(current) == len(nums):
                result.append(current.copy())
                return
            for i in range(0, len(nums)):
                if used[i] or (i > 0 and nums[i] == nums[i-1] and not used[i-1]):
                    continue
                current.append(nums[i])
                used[i] = True
                backtrack(used, current)
                used[i] = False
                current.pop()
        backtrack([False]*len(nums), [])
        return result
                
        