class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        return backtrack(grid, m, n, 0, 0, dp);
    }
    
    public int backtrack(int[][] grid, int m, int n, int i, int j, int[][] dp){
        if(i==m-1 && j == n-1){
            return grid[i][j];
        } else if(i > m-1 || j > n-1){
            return Integer.MAX_VALUE;
        } else if(dp[i][j] != 0) {
            return dp[i][j];
        } else {
          
           dp[i][j] =  grid[i][j] + Math.min(backtrack(grid, m, n, i, j+1, dp), backtrack(grid, m, n, i+1, j, dp));
            return dp[i][j];
        }
        
    }
}