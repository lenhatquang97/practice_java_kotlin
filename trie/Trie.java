import java.util.*;
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
    
    public boolean search(String word) {
        int n = word.length();
        TrieNode p = root;
        for(int i=0;i<n;i++){
            int next = word.charAt(i) - 'a';
            if(p.child[next]==null){
                return false;
            }
            p = p.child[next];
        }
        return p.count > 0;
    }
    
    public boolean startsWith(String prefix) {
        int n = prefix.length();
        TrieNode p = root;
        for(int i=0;i<n;i++){
            int next = prefix.charAt(i) - 'a';
            if(p.child[next]==null){
                return false;
            }
            p = p.child[next];
        }
        return true;
    }
    //Word Break
    public List<Integer> segmentWord(String prefix){
        List<Integer> res = new ArrayList<>();
        int n = prefix.length();
        TrieNode p = root;
        for(int i=0;i<n;i++){
            int next = prefix.charAt(i) - 'a';
            if(p.child[next]==null){
                break;
            }
            if(p.child[next].count > 0){
                res.add(i);
            }
            p = p.child[next];
        }
        return res;
    }
}
