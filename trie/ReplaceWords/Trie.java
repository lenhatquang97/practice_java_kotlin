package ReplaceWords;

public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        int n = word.length();
        TrieNode p = root;
        for(int i=0;i<n;i++){
            int next = word.charAt(i) - 'a';
            if(p.child[next]==null){
                p.child[next] = new TrieNode();
            }
            p = p.child[next];
        }
        ++p.count;
    }
    
    public String startsWith(String prefix) {
        StringBuilder res = new StringBuilder();
        int n = prefix.length();
        TrieNode p = root;
        for(int i=0;i<n;i++){
            int next = prefix.charAt(i) - 'a';
            if(p.child[next]==null){
                return "";
            }
            p = p.child[next];
            res.append(prefix.charAt(i));
            if(p.count > 0){
                return res.toString();
            }
        }
        return res.toString();
    }
}
