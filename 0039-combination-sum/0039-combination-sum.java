class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }
    
    public void backtrack(int[] candidates, int target, List<List<Integer>> result, List<Integer> current, int start){
        if(target == 0 && current.size() > 0){
            result.add(new ArrayList<>(current));
            return;
        } else if(target < 0){
            return;
        } else {
            for(int i=start;i<candidates.length;i++){
                current.add(candidates[i]);
                backtrack(candidates, target-candidates[i], result, current, i);
                current.remove(current.size()-1);
            }
            return;
        }
    }
}