// leetcode  14 

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix2(strs));
    }

    /*this method takes more time because it is sorting the array 
    so TC=O(n * m * log(m))
    
    Refernce = https://www.youtube.com/watch?v=XX4ikVj6Bug
    */
    public static String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int i=0;
        while (i<str1.length()) {
            if(str1.charAt(i)==str2.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        /*
         * statement return index==0?"":str1.substring(0,index); is a ternary operator statement in Java.
         * reduce line of code 
         * due to the sorting operation, especially for larger input sizes. 
         * However, it may perform better in certain cases where the common prefix is shorter compared to the lengths of the strings.
         */
        return i==0?"":str1.substring(0, i) ;
    }

    //this is the other way of doing but less TC=O(m * n)
    public static String longestCommonPrefix2(String[] strs){
// edge case
        if (strs == null || strs.length == 0) {
            return "";
        }
        for(int i=0; i<strs[0].length();i++){
            char c = strs[0].charAt(i);
        
        for(int j=0; j<strs.length;j++){
            if(i==strs[j].length() || strs[j].charAt(i)!=c){
                return strs[0].substring(0,i);
            }
        }
    }
        return strs[0];
    }
}
