package ReplaceWords;
import java.util.*;
public class ReplaceWordsClass {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        Trie trie = new Trie();
        for(String str: dictionary){
            trie.insert(str);
        }
        for(int i=0;i < words.length;i++){
            String res = trie.startsWith(words[i]);
            if(res.length() != 0){
                words[i] = res;
            }
        }
        return String.join(" ",words);
        
    }
}
