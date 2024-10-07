class Solution {
    public String longestWord(String[] words) {
        Trie trie = new Trie();
        for(String word : words){
            trie.insert(word);
        }
        return trie.longest();
    }
}

class TrieNode{
    TrieNode[] children;
    boolean isWord;
    TrieNode(){
        this.children = new TrieNode[26];
        this.isWord = false;
    }
}

class Trie{
    TrieNode root;
    Trie(){
        this.root = new TrieNode();
    }
    public void insert(String word){
        TrieNode node = this.root;
        for(char ch : word.toCharArray()){
            if(node.children[ch-'a']==null){
                node.children[ch-'a'] = new TrieNode();
            }
            node = node.children[ch-'a'];
        }
        node.isWord = true;
    }
    public String longest(){
        return findLongestWordHelper(this.root);
    }
    private String findLongestWordHelper(TrieNode root) {
            String longestSuffix = "";

            for(int i = 0; i < 26; ++i) {
                if(root.children[i] == null || !root.children[i].isWord)
                    continue;

                String suffix = (char) (i + 'a') + findLongestWordHelper(root.children[i]);

                if(longestSuffix.length() < suffix.length())
                    longestSuffix = suffix;
            }

            return longestSuffix;
        }
}