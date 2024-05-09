class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] count_s = new int[200];
        int[] count_t = new int[200];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(count_s[(int) s.charAt(i)]!=count_t[(int) t.charAt(i)]){
                return false;
            }
            count_s[(int) s.charAt(i)] = i + 1;
            count_t[(int) t.charAt(i)] = i + 1;
        }
        return true;
    }
}