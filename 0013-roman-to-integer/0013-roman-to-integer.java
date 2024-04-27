class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int num = 0;
        int prev = Integer.MIN_VALUE;
        for(int i=s.length()-1; i>=0; i--){
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if(num < prev){
                result = result - num;
            } else {
                result = result + num;
            }
            prev = num;
            
        }
        return result;
    }
}