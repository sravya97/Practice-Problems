class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), n, k, 1);
        return result;
    }
    
    public void backtrack(List<List<Integer>> result, List<Integer> curr, int n, int k, int i){
        if(curr.size()==k){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int j=i;j<=n;j++){
            curr.add(j);
            backtrack(result, curr, n, k, j+1);
            curr.remove(curr.size()-1);
        }
    }
}