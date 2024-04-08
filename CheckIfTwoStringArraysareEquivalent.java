// 1662. leetcode
public class CheckIfTwoStringArraysareEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[]   word2 = {"a", "bdc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
        
    }
    // both works same 
    public static boolean arrayStringsAreEqual(String[] word1 ,String[] word2){

        StringBuilder sb = new StringBuilder();
        for (String string : word1) {
            sb.append(string);
        }

        StringBuilder sb1 = new StringBuilder();
        for (String string : word2) {
            sb1.append(string);
        }
        // return sb.toString().equals(sb1.toString());
        return helper(word1).equals(helper(word2));
    }
// using helper to reduce code
    public static String helper(String[] word){
        StringBuilder sb =new StringBuilder();
        for (String words : word) {
            sb.append(words);
        }
        return sb.toString();
    }
}
