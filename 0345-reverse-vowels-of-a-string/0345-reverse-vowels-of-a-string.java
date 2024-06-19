class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char sarray[] = s.toCharArray();
        String vowels = "aeiouAEIOU";
        while(left < right){
            while(left < right && vowels.indexOf(sarray[left]) == -1){
                left++;
            }
            while(left < right && vowels.indexOf(sarray[right]) == -1){
                right--;
            }
            char temp = sarray[left];
            sarray[left] = sarray[right];
            sarray[right] = temp;
            left++;
            right--;
            
        }
        return new String(sarray);
    }
}