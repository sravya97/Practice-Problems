class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        if(startFuel >= target){
            return 0;
        }
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b)->b-a);
        int minStops = 0;
        int current = startFuel;
        int index = 0;
        while(current < target){
            while(index < stations.length && stations[index][0]<= current){
                que.offer(stations[index][1]);
                index++;
            }
            if(que.isEmpty()){
                return -1;
            }
            current = current + que.poll();
            minStops++;
        }
        return minStops;

    }
}