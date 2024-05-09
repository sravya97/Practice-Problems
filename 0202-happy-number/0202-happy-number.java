class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = getSquaresSum(slow);
            fast = getSquaresSum(getSquaresSum(fast));
        }while(slow != fast);
        if(slow == 1){
            return true;
        } else {
            return false;
        }
    }
    
    public int getSquaresSum(int n){
        
            int sum = 0;
            while(n > 0){
                int rem = n % 10;
                n = n / 10;
                sum = sum + rem * rem;
            }
            return sum;
    }
}