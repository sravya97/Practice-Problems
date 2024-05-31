class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int current = 0;
        int first = 0;
        for(int i=0;i<nums.length;i++){
            current = current + nums[i];
            while(current >= target){
                result = Math.min(result, i-first + 1);
                current = current - nums[first++];
            }
        }

        return result != Integer.MAX_VALUE ? result : 0;
    }
}