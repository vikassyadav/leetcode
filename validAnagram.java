// leetcode 242
package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class validAnagram {
    public static void main(String[] args) {
        String s = "ram";
        String t = "mar";
        System.out.println(isValid(s, t));
        
    }
    public static boolean isValid(String s ,String t ){
        if(s.length()!=t.length()) return false;

        char[] a = s.toCharArray();
        char[] b =t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);


        return Arrays.equals(a,b );
    }
    
}
