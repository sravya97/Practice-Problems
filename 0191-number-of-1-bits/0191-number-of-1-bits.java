class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        while(n != 0){
            int digit = n % 2;
            if(digit == 1) result++;
            n = n / 2;
        }
        return result;
    }
}