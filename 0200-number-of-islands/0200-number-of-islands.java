class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    graph(grid, n, m, visited, i, j);
                    count++;
                }
                
            }
        }
        return count;
    }

    public void graph(char[][] grid, int n, int m, boolean[][] visited, int row, int col){
        if(row < 0 || col < 0 || row >= n || col >= m || visited[row][col] || grid[row][col]=='0'){
            return;
        }
        visited[row][col] = true;
        graph(grid, n, m, visited, row+1, col);
        graph(grid, n, m, visited, row, col+1);
        graph(grid, n, m, visited, row-1, col);
        graph(grid, n, m, visited, row, col-1);
        return;
        
    }
}