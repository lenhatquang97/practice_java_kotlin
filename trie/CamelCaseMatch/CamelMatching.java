package CamelCaseMatch;
import java.util.*;
public class CamelMatching {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        Trie trie = new Trie();
        trie.insert(pattern);
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            res.add(trie.check(queries[i]));
        }
        return res;
    }
}
