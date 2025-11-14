class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        String maxSubString = "";
        for(int i = 0; i < s.length() - 1; i++){
            String odd = subStringP(s, i, i);
            String even = subStringP(s, i, i+1);
            if(odd.length() > maxSubString.length()){
                maxSubString = odd;
            }
            if(even.length() > maxSubString.length()){
                maxSubString = even;
            }
        }
        return maxSubString;
    }

    public String subStringP(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}