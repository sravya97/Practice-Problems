class Solution {
    public boolean backspaceCompare(String s, String t) {
        int index1 = s.length()-1;
        int index2 = t.length()-1;
        int count1 = 0;
        int count2 = 0;
        while(index1 >= 0 || index2 >= 0){
            while(index1 >= 0 && (s.charAt(index1)=='#' || count1 > 0)){
                if(s.charAt(index1)=='#'){
                    count1 ++;
                } else {
                    count1 --;
                }
                index1--;
            }
            while(index2 >= 0 && (t.charAt(index2)=='#' || count2 > 0)){
                if(t.charAt(index2)=='#'){
                    count2 ++;
                } else {
                    count2 --;
                }
                index2--;
            }
            if(index1 >= 0 && index2 >= 0 && s.charAt(index1)==t.charAt(index2)){
                index1--;
                index2--;
            } else {
                break;
            }
        }
        System.out.println(index1);
        System.out.println(index2);
        return index1 < 0 && index2 < 0;

    }
}