class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch != '.'){
                    if(!set.add(ch + "in row" + i) || !set.add(ch + "in col" + j) ||
                      !set.add(ch + "in block" + (i/3) + "-" + (j/3))){
                        return false;
                    }
                }
                
            }
        }
        return true;
    }
}