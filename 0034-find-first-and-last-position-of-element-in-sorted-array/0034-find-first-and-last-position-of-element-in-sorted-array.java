class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch( nums, target, false);
        return new int[]{left, right};
        }
    
    public int binarySearch(int[] nums, int target, boolean isLeftSearch){
        int start = 0;
        int end = nums.length-1;
        int result = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else {
                result = mid;
                if(isLeftSearch){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}