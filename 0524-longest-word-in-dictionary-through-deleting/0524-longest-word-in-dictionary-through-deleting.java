class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String result = "";
        for(String word : dictionary){
            int i=0;
            for(char ch : s.toCharArray()){
                if(i< word.length() && ch ==word.charAt(i)){
                    i++;
                }
            }
            if(i==word.length()){
                if(result.length() < word.length()){
                    result = word;
                } else if(result.length() == word.length()){
                    if(word.compareTo(result) < 0){
                        result = word;
                    }
                }
            }
        }
        return result;
    }
}