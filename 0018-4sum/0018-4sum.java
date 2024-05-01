class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1; j<nums.length-2;j++){
                List<Integer> curr = new ArrayList<>();
                int start = j+1;
                int end = nums.length-1;
                while(start < end){
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];
                    if(sum == target){
                        set.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                    } else if(sum < target){
                        start ++;
                    } else {
                        end--;
                    }
                }
            }
        }
        result.addAll(set);
        return result;
    }
}