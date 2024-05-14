class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        result = []
        start = 0
        for i in range(0, len(nums)):
            end = i
            if i == len(nums)-1 or nums[i] != nums[i+1]-1:
                if start == end:
                    result.append(str(nums[start]))
                else:
                    result.append(str(nums[start]) + "->" + str(nums[end]))
                start = i+1
        return result
                    