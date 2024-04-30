class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> result = new ArrayList<>();
        getCombos(digits, 0, "", result, map);
        return result;
    }
    
    public void getCombos(String digits, int pos, String curr, List<String> result, Map<Character, String> map){
        if(pos == digits.length()){
            if(!curr.isEmpty()){
                  result.add(curr);
            }
            return;
        } 
        char ch = digits.charAt(pos);
        String values = map.get(ch);
        for(int j=0;j<values.length();j++){
            curr += values.charAt(j);
            getCombos(digits, pos + 1, curr, result, map);
            curr = curr.substring(0, curr.length()-1);
        }
    }
}