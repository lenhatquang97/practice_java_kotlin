package CamelCaseMatch;

public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        int n = word.length();
        TrieNode p = root;
        int next = 0;
        for(int i=0;i<n;i++){
            if(word.charAt(i) >= 'A' && word.charAt(i)<='Z'){
                next = 26 + word.charAt(i) - 'A';
            } else {
                next = word.charAt(i) - 'a';
            }
            if(p.child[next]==null){
                p.child[next] = new TrieNode();
            }
            p = p.child[next];
        }
        ++p.count;
    }
    
    public boolean check(String word) {
        int n = word.length();
        TrieNode p = root;
        int next = 0;
        for(int i=0;i<n;i++){
            if(word.charAt(i) >= 'A' && word.charAt(i)<='Z'){
                next = 26 + word.charAt(i) - 'A';
                if(p.child[next]==null){
                    return false;
                } else {
                    p = p.child[next];
                }
            } else {
                next = word.charAt(i) - 'a';
                if(p.child[next] != null){
                    p = p.child[next];        
                }
            }
        }
        return p.count > 0;
    }
}
