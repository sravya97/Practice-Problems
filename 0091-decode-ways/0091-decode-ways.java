class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return countTimes(s, 0, dp);
    }
    
    public int countTimes(String s, int curr, int[] dp){
        if(curr == s.length()){
            return 1;
        } 
        if(s.charAt(curr) == '0'){
            return 0;
        }
        if(dp[curr] != -1){
            return dp[curr];
        }
        int count = countTimes(s, curr+1, dp);
        if(curr < s.length()-1 && Integer.parseInt(s.substring(curr, curr+2)) < 27)         {
            count += countTimes(s, curr+2, dp);
        }
        dp[curr] = count;
        return dp[curr];
    }
}