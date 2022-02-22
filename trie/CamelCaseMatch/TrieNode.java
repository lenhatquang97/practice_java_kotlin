package CamelCaseMatch;

public class TrieNode {
    public TrieNode[] child;
    private final int R = 52;
    public int count;
    public TrieNode(){
        child = new TrieNode[R];
        for(int i=0;i<52;i++){
            child[i] = null;
        }
        count = 0;
    }
}
