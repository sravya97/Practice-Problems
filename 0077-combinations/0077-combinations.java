class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combinations(1, n, k, new ArrayList<>(), result);
        return result;
    }

    public void combinations(int start, int n, int k, List<Integer> curr, 
    List<List<Integer>> result){
        if(curr.size()==k){
            result.add(new ArrayList<>(curr));
        }
        for(int i=start;i<=n;i++){
            curr.add(i);
            combinations(i+1, n, k, curr, result);
            curr.remove(curr.size()-1);
        }
    }
}