class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int length = s.length();
        int left = 0;
        int right = length - 1;
        while ( left < right){
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(l == ' ' || !Character.isLetterOrDigit(l)){
                left ++;
                continue;
            }
            if(r == ' ' || !Character.isLetterOrDigit(r)){
                right --;
                continue;
            }
            if(Character.toLowerCase(l) == Character.toLowerCase(r)){
                left ++;
                right --;
            } else {
                return false;
            }
        }
        return true;
    }
}