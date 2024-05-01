class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recursive(n, 0, 0, "", result);
        return result;
    }
    
    public void recursive(int n, int open, int close, String current, List<String> result){
        if(open == n && close == n){
            result.add(current);
            return;
        }
        if(open < n){
            recursive(n, open+1, close, current + "(", result);
        }
        if(open > close){
            recursive(n, open, close+1, current + ")", result);
        }
        return;
    }
}