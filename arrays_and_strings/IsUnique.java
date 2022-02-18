package arrays_and_strings;
import java.util.HashSet;
public class IsUnique {
    public static boolean isUnique(String str){
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0;i < str.length();i++){
            if (!hashSet.contains(str.charAt(i))){
                hashSet.add(str.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }
}
