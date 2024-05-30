class Solution {
    public int jump(int[] nums) {
        int maxReach = 0;
        int minJumps = 0;
        int lastJump = 0;
        int i = 0;
        while(lastJump < nums.length-1){
            maxReach = Math.max(maxReach, i + nums[i]);
            if(i == lastJump){
                lastJump = maxReach;
                minJumps++;
            }
            i++;
        }
        return minJumps;
    }
}