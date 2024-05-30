class Solution:
    def jump(self, nums: List[int]) -> int:
        maxReach = 0
        jumps = 0
        lastJump = 0
        i = 0
        while lastJump < len(nums)-1:
            maxReach = max(maxReach, i+nums[i])
            if i == lastJump:
                lastJump = maxReach
                jumps += 1
            i+=1
        return jumps
        