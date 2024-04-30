import sys
class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        result = sys.maxsize 
        for i in range(0, len(nums)-2):
            left = i+1
            right = len(nums) - 1
            while left < right:
                sums = nums[i] + nums[left] + nums[right]
                if(abs(target-sums) < abs(target-result)):
                    result = sums
                if sums < target:
                    left += 1
                else:
                    right -= 1
        return result
        
        return 1
        