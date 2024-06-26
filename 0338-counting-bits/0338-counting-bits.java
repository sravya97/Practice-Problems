class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;
        int offset = 1;
        for(int i=1;i<n+1;i++){
            if(i == offset * 2){
                offset = offset * 2;
            }
            result[i] = result[i-offset] + 1;
        }
        return result;
    }
}