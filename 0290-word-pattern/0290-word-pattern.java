class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split("\\s+");
        if(words.length != pattern.length()){
            return false;
        }
        Map<Character, String> dict = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(dict.containsKey(ch)){
                if(dict.get(ch).equals(words[i])){
                    continue;
                } else {
                    return false;
                }
            }else if(dict.containsValue(words[i])){
                return false;
            }else{
                dict.put(ch, words[i]);
            }
        }
        return true;
    }
}