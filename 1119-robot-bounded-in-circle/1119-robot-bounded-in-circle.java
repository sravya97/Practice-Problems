class Solution {
    public boolean isRobotBounded(String instructions) {
        int i=0;
        int x = 0;
        int y = 0;
        int[][] directions = {{0,1}, {1,0}, {0, -1}, {-1, 0}};
        for(char ch: instructions.toCharArray()){
            if(ch=='L'){
                i = (i+3)%4;
            } else if(ch=='R'){
                i = (i+1)%4;
            } else{
                x += directions[i][0];
                y += directions[i][1];
            }
        }
        return x==0&y==0 || i > 0;
    }
}