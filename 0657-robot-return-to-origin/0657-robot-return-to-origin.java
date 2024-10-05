class Solution {
    public boolean judgeCircle(String moves) {
        int upCount = 0;
        int rightCount = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'R'){
                rightCount++;
            } else if(ch == 'L'){
                rightCount--;
            } else if(ch == 'U'){
                upCount++;
            } else {
                upCount--;
            }
        }
        return upCount==0 && rightCount==0;
    }
}