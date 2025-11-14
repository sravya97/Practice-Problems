class Solution {
    public int lengthOfLongestSubstring(String s) {
        int counter = 0;
        int result = 0;
        int start = 0;
        Set<Character> sett = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(sett.contains(ch)){
                while(sett.contains(ch)){
                    sett.remove(s.charAt(start));
                    start++;
                }
                sett.add(ch);
                counter = i-start+1;
            } else {
                sett.add(ch);
                counter++;
            }
            result = Math.max(result, counter);
        }
        return result;
        
    }
}