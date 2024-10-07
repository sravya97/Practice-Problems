class Solution {
    public int numTeams(int[] rating) {
        int result = 0;
        for(int i=0;i<rating.length;i++){
            int lessBefore =0, lessAfter=0, moreAfter = 0, moreBefore=0;

            for(int j=0;j<i;j++){
                if(rating[j]<rating[i]){
                    lessBefore++;
                } else {
                    moreBefore++;
                }
            }
            for(int k=i+1;k<rating.length;k++){
                if(rating[k]<rating[i]){
                    lessAfter++;
                } else {
                    moreAfter++;
                }
            }
            result += (lessBefore*moreAfter) + (lessAfter*moreBefore);
        }
        return result;
    }
}