class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int directions[][] = {{0,1}, {1, 0}, {0, -1}, {-1, 0}};
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.offer(new int[]{i, j});
                } else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int minutes = -1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int[] node = queue.poll();
                int row = node[0];
                int col = node[1];
                for(int[] dir : directions){
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    if(newRow < 0 || newCol < 0 || newRow >= n || 
                    newCol >= m || grid[newRow][newCol]!=1){
                        continue;
                    }
                    grid[newRow][newCol] = 2;
                    queue.offer(new int[]{newRow, newCol});
                    fresh--;
                }
            }
            minutes++;
        }
        if(fresh == 0){
            return minutes;
        } else {
            return -1;
        }
    }
}