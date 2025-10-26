class Solution {
    public int removeDuplicates(int[] nums) {
        int finalLength = 1;
        int previous = nums[0];
        for(int i = 1; i <= nums.length-1; i++){
            if(previous == nums[i]){
                continue;
            } else {
                previous = nums[i];
                nums[finalLength] = nums[i];
                finalLength++;
            }
        }
        return finalLength;
    }
}