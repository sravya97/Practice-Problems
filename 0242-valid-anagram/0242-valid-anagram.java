class Solution {
    public boolean isAnagram(String s, String t) {
        int list1[] = new int[26];
        int list2[] = new int[26];
        for(char ch : s.toCharArray()){
            list1[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            list2[ch - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
}