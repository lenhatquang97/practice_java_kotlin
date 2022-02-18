package arrays_and_strings;
import java.util.*;
public class CheckPermutation {
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
    public static void addToHashMap(HashMap<Character, Integer> hashMap, char c){
        if(!hashMap.containsKey(c)){
            hashMap.put(c,0);
        }
        else {
            hashMap.put(c, hashMap.get(c) + 1);
        }
    }
    public static boolean checkPermutation(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        HashMap<Character,Integer> hashMap1 = new HashMap<>();
        HashMap<Character,Integer> hashMap2 = new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char c = str1.charAt(i);
            char k = str2.charAt(i);
            addToHashMap(hashMap1,c);
            addToHashMap(hashMap2,k);
        }
        for(int i=0;i<str1.length();i++){
            if(!hashMap2.containsKey(str1.charAt(i)))
                return false;
            if(hashMap1.get(str1.charAt(i)) != hashMap2.get(str1.charAt(i)))
                return false;
        }
        return true;
    }
}
