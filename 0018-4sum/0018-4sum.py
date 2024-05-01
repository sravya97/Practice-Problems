class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        result = []
        unique = set()
        nums.sort()
        for i in range(0, len(nums)-3):
            for j in range(i+1, len(nums)-2):
                start = j+1
                end = len(nums)-1
                while start < end:
                    sums = nums[i] + nums[j] + nums[start] + nums[end]
                    if sums == target:
                        unique.add(tuple([nums[i], nums[j], nums[start], nums[end]]))
                        start += 1
                        end -= 1
                    elif sums < target:
                        start += 1
                    else:
                        end -= 1
        result = list(unique)
        return result