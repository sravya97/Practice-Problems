class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        while(end < nums.length){
            sum += nums[end];
            while(sum >= target){
                result = Math.min(result, end-start+1);
                sum = sum - nums[start];
                start++;
            }
            end++;
        }
        
        if(result == Integer.MAX_VALUE){
            return 0;
        } else {
            return result;
        }
    }
}