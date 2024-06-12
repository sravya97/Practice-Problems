class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> merged = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        for(int i=0;i<intervals.length;i++){
            int current_start = intervals[i][0];
            int current_end = intervals[i][1];
            if(start > current_end){
                merged.add(Arrays.asList(current_start, current_end));
            } else if(end < current_start){
                merged.add(Arrays.asList(start, end));
                start = current_start;
                end = current_end;
            } else{
                start = Math.min(start, current_start);
                end = Math.max(end, current_end);
            }
        }
        merged.add(Arrays.asList(start, end));
        int[][] result = new int[merged.size()][2];
        for(int i=0;i<merged.size();i++){
            result[i][0] = merged.get(i).get(0);
            result[i][1] = merged.get(i).get(1);
        }
        return result;
    }
}