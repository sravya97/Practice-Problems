class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        if(s.length() <= 1){
            return s;
        }
        for(int i=0;i<s.length()-1;i++){
            String odd = expand(s, i, i);
            String even = expand(s, i, i+1);
            if(odd.length() > result.length()){
                result = odd;
            }
            if(even.length() > result.length()){
                result = even;
            }
            
        }
        return result;
    }
    
    public String expand(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
    
}