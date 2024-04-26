class Solution {
    public int numberOfSpecialChars(String word) {
        int lower[] = new int[26];
        int upper[] = new int[26];
        for(char ch : word.toCharArray()){
            int val = ch-'a';
            if(val < 0){
                val = ch-'A';
                upper[val]++;
            } else {
                lower[val]++;
            }
        }
        int result = 0;
        for(int i=0;i<26;i++){
            if(lower[i] > 0 && upper[i] > 0){
                result++;
            }
    
        }
        return result;
    }
}