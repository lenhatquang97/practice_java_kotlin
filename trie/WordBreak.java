import java.util.*;
public class WordBreak {
    private HashMap<String, Boolean> hashMap = new HashMap<>();
    public boolean isSegmented(String segmented, Trie trie){
        if(hashMap.containsKey(segmented)){
            return hashMap.get(segmented);
        }
        if(segmented.length() == 0) return true; 
        List<Integer> firstWords = trie.segmentWord(segmented);
        if(firstWords.size() == 0){
            return false;
        }
        boolean val = false;
        for(Integer num: firstWords){
            val = val || isSegmented(segmented.substring(num+1),trie);
            if(val == true) return true;
            hashMap.put(segmented.substring(num+1), val);
        }
        return val;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Trie trie = new Trie();    
        for(String itr: wordDict){
            trie.insert(itr);
        }
        return isSegmented(s, trie);
        
    }
}
