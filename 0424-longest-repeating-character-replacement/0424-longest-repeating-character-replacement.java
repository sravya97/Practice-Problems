class Solution {
    public int characterReplacement(String s, int k) {
        /*
        Have a window from start to end.
        Keep track of most frequent letter
        The number of characters to replace = window size - most frequent letter
        if(number of chars to replace is > k) -> then shift the window
        keep track of max window size
        */
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