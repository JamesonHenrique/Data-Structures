package Trie;

public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    public static class TrieNode {
        private TrieNode[] children;
        private Boolean isEndOfWord;
        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("Jameson");
        trie.insert("James");
        trie.insert("Jennefy");

    }

}
