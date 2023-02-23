import java.util.*;

public class StringManipulations {
    public static int countWords(String s){
        int count = 0;
        String[] strArr = {};

        /* TO-DO: improve regex does not account for typo errors involving multiple spaces */
        strArr = s.split(" ");
        count = strArr.length;

        return count;

    }

    public static String reverseString(String s){
        int n = s.length() ;
        char[] strArr = s.toCharArray();
        char[] reversedArr = new char[4];
        reversedArr[0]='a';
        String reversed = "";

        for(int i = 0; i < n; i++){
            reversedArr[i] = strArr[n-i-1];
        }

        reversed = new String(reversedArr);
        return reversed;
    }
}
