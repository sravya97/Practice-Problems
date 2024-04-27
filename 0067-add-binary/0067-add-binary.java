class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int carry = 0;
        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        while(p1 >= 0 || p2 >= 0 || carry != 0){
            if(p1 >= 0){
                carry += a.charAt(p1) - '0';
                p1--;
            }
            if(p2 >= 0){
                carry += b.charAt(p2) - '0';
                p2--;
            }
            result = carry % 2 + result;
            carry = carry / 2;
        }
        return result;
        }
}