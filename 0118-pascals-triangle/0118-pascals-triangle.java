class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0){
            return  result;
        } 
        if(numRows == 1){
            result.add(Arrays.asList(1));
            return result;
        }
        result = generate(numRows - 1);
        List<Integer> prev = result.get(numRows - 2);
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        for(int i = 1; i < numRows - 1; i++){
            curr.add(prev.get(i-1) + prev.get(i));
        }
        curr.add(1);
        result.add(curr);
        return result;
        
    }
}