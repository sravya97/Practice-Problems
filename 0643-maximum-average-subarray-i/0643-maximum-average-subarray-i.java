class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int i=0;
        while(i <k){
            sum+=nums[i];
            i++;
        }
        int maxSum=sum;
        for(i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum/k;
        
    }
}