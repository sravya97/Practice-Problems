class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> first = new ArrayList<>();
        if(rowIndex == -1){
            return first;
        }
        if(rowIndex == 0){
            first = Arrays.asList(1);
            return first;
        }
        List<Integer> prev = first;
        List<Integer> curr = new ArrayList<>();
        for(int i=1;i<=rowIndex;i++){
            curr = new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }
            curr.add(1);
            prev = curr;
        }
        return curr;       
    }
}