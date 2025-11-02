class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        int carry = 1;
        for(int i = digits.length - 1; i>= 0; i--){
            int sum = digits[i] + carry;
            carry = sum / 10;
            result[i + 1] = sum % 10;
        }
        if(carry != 0){
            result[0] = carry;
            return result;
        } 
        return Arrays.copyOfRange(result, 1, result.length);
    }
}