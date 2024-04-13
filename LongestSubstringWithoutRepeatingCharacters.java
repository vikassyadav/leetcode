// leetcode 3 
package String;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        
    }
    public static int lengthOfLongestSubstring(String s) {
        int end =0,start=0,maxLength=0;
        List<Character> list = new ArrayList<Character>();
        while (end<s.length()) {
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxLength=Math.max(maxLength, list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;

            }
        }
        return maxLength;
        
    }
}
