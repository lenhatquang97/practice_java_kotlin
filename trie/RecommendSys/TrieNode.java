package RecommendSys;
import java.util.*;
public class TrieNode{
    public List<String> words;
    public TrieNode[] child;
    private final int R = 26;
    public int count;
    public TrieNode(){
        words = new ArrayList<>();
        child = new TrieNode[R];
        for(int i=0;i<count;i++){
            child[i] = null;
        }
        count = 0;
    }
}

