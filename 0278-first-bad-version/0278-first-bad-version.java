/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;
        int solution = n;
        while(start < end){
            int mid = start + (end-start)/2;
            boolean isBad = isBadVersion(mid);
            if(isBad){
                end = mid;
                solution = Math.min(mid, solution);
            } else {
                start = mid + 1;
            }
        }
        return solution;
    }
}