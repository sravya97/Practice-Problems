class Solution {
    public char findTheDifference(String s, String t) {
        int[] countS = new int[26];
        for(char ch : s.toCharArray()){
            countS[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            if(countS[ch-'a'] == 0){
                return ch;
            } else{
                countS[ch-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            if(countS[i]!=0){
                return (char)(i + 'a');
            }
        }
        return 'a';
    }
}