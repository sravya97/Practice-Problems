class NumArray {
    int []dp;
    public NumArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = nums[i] + dp[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return dp[right];
        }
        return dp[right] - dp[left-1];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */