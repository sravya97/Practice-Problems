class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();
        for(int i=0;i<nums.length;i++){
            trie.insert(nums[i]);
        }
        int answer = 0;
        for(int i=0;i<nums.length;i++){
            answer = Math.max(answer, trie.find_max(nums[i]));
        }
        return answer;
    }
}

class TrieNode{
    TrieNode[] children = new TrieNode[2];
    TrieNode(){
    }
    public boolean containsKey(int bit){
        return this.children[bit]!=null;
    }
    public void put(int bit, TrieNode node){
        this.children[bit] = node;
    }
    public TrieNode get(int bit){
        return this.children[bit];
    }
}
class Trie{
    static TrieNode root;
    public Trie(){
        root = new TrieNode();
    }
    public static void insert(int num){
        TrieNode node = root;
        for(int i=31;i>=0;i--){
            int bit = ((num >>i) & 1);
            if(!node.containsKey(bit)){
                node.put(bit, new TrieNode());
            }
            node = node.get(bit);
        }
    }

    public static int find_max(int num){
        int maximum = 0;
        TrieNode node = root;
        for(int i=31;i>=0;i--){
            int bit = ((num >> i) & 1);
            if(node.containsKey(1-bit)){
                maximum = (maximum | 1 << i);
                node = node.get(1-bit);
            } else {
                node = node.get(bit);
            }
        }
        return maximum;
    }

}