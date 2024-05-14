class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int start = 0;
        for(int i=0;i<nums.length;i++){
             int end = i;
            if(i == nums.length-1 || nums[i] != nums[i+1]-1){
                if(start == end){
                    result.add(String.valueOf(nums[start]));
                } else {
                    result.add(nums[start] + "->" + nums[end]);
                }
                start = i+1;
            } 
        }
        return result;
    }
}