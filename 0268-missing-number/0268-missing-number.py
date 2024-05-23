class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        missing = len(nums)
        for i in range (0, len(nums)):
            missing = missing ^ i ^ nums[i]
        return missing
        