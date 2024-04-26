class Solution {
    public String findLatestTime(String s) {
        String output = "";
        if(s.charAt(0) == '?' && s.charAt(1) == '?'){
            output += "11";
        } else if(s.charAt(0) == '?' && s.charAt(1) > '1'){
            output += '0' + String.valueOf(s.charAt(1));
        } else if(s.charAt(0) == '?'){
            output += '1' + String.valueOf(s.charAt(1));
        } else if(s.charAt(0) == '0' && s.charAt(1) == '?'){
            output += "09"; 
        } else if(s.charAt(0) == '1' && s.charAt(1) == '?') {
            output += "11";
        } else {
            output += String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(1));
        }
        output += ":";
        if(s.charAt(3) == '?'){
            output += "5";
        } else {
            output += String.valueOf(s.charAt(3));
        }
        if(s.charAt(4) == '?'){
            output += "9";
        } else {
            output += String.valueOf(s.charAt(4));
        }
        return output;
    }
}