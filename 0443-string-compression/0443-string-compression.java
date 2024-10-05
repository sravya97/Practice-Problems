class Solution {
    public int compress(char[] chars) {
        int index = 0;
        char prev = chars[0];
        int count = 1;
        for(int i=1;i<chars.length;i++){
            if(prev == chars[i]){
                count++;
            } else {
                chars[index++] = prev;
               
                if(count > 1){
                    String value = count + "";
                    for(char c : value.toCharArray()){
                        chars[index++] = c;
                    }
                } 
                count = 1;
                prev = chars[i];
            }
        }
        chars[index++] = prev;
        if(count > 1){
                    String value = count + "";
                    for(char c : value.toCharArray()){
                        chars[index++] = c;
                    }
                } 
        return index;
    }
}