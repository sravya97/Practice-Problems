class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currentMax = 0;
        int min = Integer.MAX_VALUE;
        int currentMin = 0;
        int total = 0;
        for(int i=0;i<nums.length;i++){
            currentMax = Math.max(nums[i], currentMax+nums[i]);
            max = Math.max(max, currentMax);
            currentMin = Math.min(nums[i], currentMin+nums[i]);
            min = Math.min(min, currentMin);
            total += nums[i];
            
        }
        return max > 0? Math.max(max, total-min) : max;
    }
}