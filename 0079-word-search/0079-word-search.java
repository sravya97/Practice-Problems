class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                boolean visited[][] = new boolean[board.length][board[0].length];
                boolean value = backtrack(board, word, visited, 0, i, j);
                if(value){
                    return true;
                } 
            }
        }
        return false;
    }

    public boolean backtrack(char[][] board, String word, boolean visited[][], int curr, int row, int col){
        if(curr==word.length()){
            return true;
        }
        if(row >= board.length || col >= board[0].length || row < 0 || col < 0 || visited[row][col]
        || board[row][col]!=word.charAt(curr)) {
            return false;
        }
        
        visited[row][col] = true;
        boolean value = backtrack(board, word, visited, curr+1, row+1, col) || 
            backtrack(board, word, visited, curr+1, row-1, col) ||
            backtrack(board, word, visited,curr+1, row, col+1) ||
            backtrack(board, word, visited, curr+1, row, col-1); 
        if(value){
            return true;
        }
        visited[row][col] = false;
        return false;
        
    }
}