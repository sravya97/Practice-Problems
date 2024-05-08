class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def binarySearch(isLeftSearch):
            result = -1
            start = 0
            end = len(nums) - 1
            while start <= end:
                mid = start + (end-start)//2
                if nums[mid] < target:
                    start = mid + 1
                elif nums[mid] > target:
                    end = mid - 1
                else:
                    result = mid
                    if isLeftSearch:
                        end = mid - 1
                    else:
                        start = mid + 1
            return result
        return [binarySearch(True), binarySearch(False)]
                    
        