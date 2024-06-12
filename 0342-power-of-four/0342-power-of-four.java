class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        } else if(n <= 0){
            return false;
        }
        double result = Math.log(n) / Math.log(4);
        return result == (int) result ? true : false;
    }
}