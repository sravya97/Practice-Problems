class Solution {
    public String reverseWords(String s) {
        String words[] = s.split("\\s+");
        String answer = "";
        for(int i=words.length-1; i>=0; i--){
            if(words[i].isEmpty()){
                continue;
            } else{
                answer += words[i] + " ";
            }
        }
        return answer.trim();
        
    }
}