public class TrieNode{
    public TrieNode[] child;
    private final int R = 26;
    public int count;
    public TrieNode(){
        child = new TrieNode[R];
        for(int i=0;i<26;i++){
            child[i] = null;
        }
        count = 0;
    }
}