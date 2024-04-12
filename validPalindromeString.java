// leetcode 125
package String;

public class validPalindromeString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int left=0;
        int right = s.length()-1;

        while (left<=right) {
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        
        return true;
    }
}
