package arrays_and_strings;
public class URLify {
    public static void replaceSpace(char[] str, int trueLength){
        int index = str.length;
        if(trueLength < str.length) str[trueLength] = '\0';
        for(int i = trueLength - 1;i >= 0;i--){
            if(str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index-1] = str[i];
                index--;
            }
        }
    }
}
