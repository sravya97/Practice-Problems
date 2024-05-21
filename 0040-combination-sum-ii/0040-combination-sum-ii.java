class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> curr = new ArrayList<>();
        backtrack(result, curr, candidates, target, 0);
        return result;
    }
    
    public void backtrack(List<List<Integer>> result, List<Integer> curr, int[] candidates, int target, int index){
        if(target == 0 && curr.size()>0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i > index && candidates[i] == candidates[i-1]){
                continue;
            }
            curr.add(candidates[i]);
            backtrack(result, curr, candidates, target-candidates[i], i+1);
            curr.remove(curr.size()-1);
        }
    }
}