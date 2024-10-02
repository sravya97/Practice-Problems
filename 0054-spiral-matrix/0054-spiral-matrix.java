class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            for(int i=startCol;i<=endCol;i++){
                result.add(matrix[startRow][i]);
            }
            startRow++;
            for(int i=startRow;i<=endRow;i++){
                result.add(matrix[i][endCol]);
            }
            endCol--;
            if(startRow > endRow || startCol > endCol){
                break;
            }
            for(int i=endCol;i>=startCol;i--){
                result.add(matrix[endRow][i]);
            }
            endRow--;
            for(int i=endRow;i>=startRow;i--){
                result.add(matrix[i][startCol]);
            }
            startCol++;
        }
        return result;
    }
}