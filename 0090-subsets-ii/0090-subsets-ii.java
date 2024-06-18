class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, result, new ArrayList<>(), 0);
        return result;
    }
    
    public void backtrack(int[] nums, List<List<Integer>> result, List<Integer> curr, int index){
        result.add(new ArrayList<>(curr));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            backtrack(nums, result, curr, i+1);
            curr.remove(curr.size()-1);
        }
    }
}