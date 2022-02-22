package RecommendSys;
import java.util.*;
public class RecommendSystem{
    public List<List<String>> suggestedProducts(String[] products, String searchWord){
        Trie trie = new Trie();
        for(int i=0;i<products.length;i++){
            trie.insert(products[i]);
        }
        List<List<String>> answer = trie.getWords(searchWord);
        for(List<String> itr: answer){
            Collections.sort(itr);
            while(itr.size() > 3){
                itr.remove(itr.size()-1);
            }
        }
        return answer;
    }
}