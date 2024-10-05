class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] moves = {{1,2}, {2,1}, {-1,2}, {-2,1}, {1,-2}, {2,-1}, {-1,-2}, {-2,-1}};
        double[][] dp = new double[n][n];
        double[][] prev = new double[n][n];
        prev[row][column] = 1;
        for(int step=0;step<k;step++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    dp[i][j] = 0;
                    for(int[] move : moves){
                        int prevRow = i - move[0];
                        int prevCol = j - move[1];
                        if(prevRow >= 0 && prevRow < n && prevCol >= 0 && prevCol < n){
                            dp[i][j] = dp[i][j] + (prev[prevRow][prevCol] / 8.0);
                        }
                    }
                }
            }
            double[][] temp = dp;
            dp = prev;
            prev = temp;
        }
        double result = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result += prev[i][j];
            }
        }
        return result;
        
    }
}