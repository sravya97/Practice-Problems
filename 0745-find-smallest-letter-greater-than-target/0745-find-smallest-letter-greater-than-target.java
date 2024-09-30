class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int mid = 0;
        if(target + 1 < letters[0] || target + 1 > letters[end]){
            return letters[0];
        }
        while(start <= end){
            mid = (end-start)/2 + start;
            if(letters[mid] > target){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
        
    }
}