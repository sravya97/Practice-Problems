class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int missing = length;
        for(int i=0;i<length;i++){
            missing = missing ^ i ^ nums[i];
        }
        return missing;
    }
}