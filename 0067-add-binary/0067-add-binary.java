class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int curr1 = a.length() - 1;
        int curr2 = b.length() - 1;
        int carry = 0;
        while(curr1 >= 0 || curr2 >= 0 || carry > 0){
            if(curr1 >= 0){
                carry = carry + (a.charAt(curr1) - '0');
                curr1--;
            }
            if(curr2 >= 0){
                carry = carry + (b.charAt(curr2) - '0');
                curr2--;
            }
            result = (carry % 2) + result;
            carry = carry / 2;
        }
        return result;
    }
}