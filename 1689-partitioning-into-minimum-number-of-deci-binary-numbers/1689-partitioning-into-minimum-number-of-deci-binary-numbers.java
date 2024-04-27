class Solution {
    public int minPartitions(String n) {
        int maximum = Integer.MIN_VALUE;
        for(char ch : n.toCharArray()){
            if(maximum < ch - '0') {
                maximum = ch - '0';
            }
        }
        return maximum;
    }
}