class Solution {
    public int[] findArray(int[] pref) {
        int[] origin = new int[pref.length];
        int prev = 0;
        origin[0] = pref[0];
        for(int i=1;i<pref.length;i++) {
            origin[i] = pref[i] ^ pref[i-1];
        }
        return origin;
    }
}