class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, result, 0, 0, "");
        return result;
    }

    public void backtrack(int n, List<String> result, int open, int closed, String curr){
        if(open == closed && open == n){
            result.add(curr);
            return;
        }
        if(open < n){
            curr += "(";
            backtrack(n, result, open+1, closed, curr);
            curr = curr.substring(0, curr.length()-1);
        }
        if(closed < open){
            curr += ")";
            backtrack(n, result, open, closed+1, curr);
            curr = curr.substring(0, curr.length()-1);
        }
    }
}