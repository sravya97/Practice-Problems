class Solution {
    public int strStr(String haystack, String needle) {
        int left = 0;
        int needleLength = needle.length();
        while(left + needleLength - 1 < haystack.length()){
            String sub = haystack.substring(left, left + needleLength);
            if(sub.equals(needle)){
                return left;
            } else {
                left ++;
                
            }
        }
        return -1;
    }
}