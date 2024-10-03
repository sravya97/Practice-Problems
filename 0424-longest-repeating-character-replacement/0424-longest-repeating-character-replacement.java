class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int[] count = new int[26];
        int maxSize = 0;
        int mostFrequent = 0;
        for(int end=0;end<s.length();end++){
            int index = s.charAt(end) - 'A';
            count[index]++;
            mostFrequent = Math.max(count[index], mostFrequent);
            int charsToReplace = (end-start+1) - mostFrequent;
            if(charsToReplace > k){
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxSize = Math.max(maxSize, end-start+1);
        }
        return maxSize;
    }
}