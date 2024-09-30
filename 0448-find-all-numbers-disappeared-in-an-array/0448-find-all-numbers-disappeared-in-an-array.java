class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            set.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(Integer i : set){
            result.add(i);
        }
        return result;
        
    }
}