class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        backtrack(result, digits, map, "", 0);
        return result;
    }

    public void backtrack(List<String> result, String digits, Map<Integer, String> map, String current, int point){
        if(point == digits.length()){
            result.add(current);
            return;
        }
        Integer p = digits.charAt(point) - '0';
        String mapValues = map.get(p);
        for(int i=0;i<mapValues.length();i++){
            current += mapValues.charAt(i);
            backtrack(result, digits, map, current, point + 1);
            current = current.substring(0, current.length()-1);
        }

    }
}