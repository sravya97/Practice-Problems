class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        } else{
            String previous = countAndSay(n-1);
            int i = 0;
            String result = "";
            while(i<previous.length()){
                char ch = previous.charAt(i);
                int count = 1;
                while(i<previous.length()-1 && ch == previous.charAt(i+1)){
                    i++;
                    count++;
                }
                result += count;
                result += ch;
                i++;
            }
            return result;
        }
    }
}