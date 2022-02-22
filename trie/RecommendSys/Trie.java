package RecommendSys;
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
            p.words.add(word);
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
    public List<List<String>> getWords(String word){
        int n = word.length();
        TrieNode p = root;
        List<List<String>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            int next = word.charAt(i) - 'a';
            if(p.child[next] == null){
                break;
            }
            p = p.child[next];
            res.add(p.words);
        }
        int count = word.length()-res.size();
        while(count > 0){
            res.add(new ArrayList<>());
            count--;
        }
        return res;
    }
}