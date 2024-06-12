class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
        int prev_start = intervals[0][0];
        int prev_end = intervals[0][1];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0] <= prev_end){
                prev_end = Math.max(intervals[i][1], prev_end);
            } else {
                result.add(Arrays.asList(prev_start, prev_end));
                prev_start = intervals[i][0];
                prev_end = intervals[i][1];
                
            }
        }
        result.add(Arrays.asList(prev_start, prev_end));
        int[][] array = new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            array[i][0] = result.get(i).get(0);
            array[i][1] = result.get(i).get(1);
        }
        return array;
    }
}