class Solution {
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
        char[] ch = s.toCharArray();
        int i = 0;
        while(i < ch.length && ch[i] == ' '){
            i++;
        }
        int sign = 1;
        if(i < ch.length) {
        if(ch[i]=='-'){
            sign = -1;
            i++;
        } else if(ch[i]=='+'){
            i++;
        }
        }
        int result = 0;
        while(i<ch.length && ch[i]=='0'){
                i++;
        }
        while(i <ch.length && Character.isDigit(ch[i])){
            int digit = ch[i] - '0';
            if(result > Integer.MAX_VALUE / 10 || 
            (result == Integer.MAX_VALUE / 10 && digit > 7)){
                return sign==-1? Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            result = (result * 10 ) + digit;
            i++;
        }
        return result * sign;
    }
}