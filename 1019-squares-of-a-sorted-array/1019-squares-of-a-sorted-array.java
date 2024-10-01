class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int[] result = new int[nums.length];
        int index = end;
        while(start <= end){
            if(Math.abs(nums[start]) < Math.abs(nums[end])) {
                result[index] = nums[end] * nums[end];
                end--;
            } else {
                result[index] = nums[start] * nums[start];
                start++;
            }
            index--;
        }
        return result;
    }
}