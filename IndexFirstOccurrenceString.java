public class IndexFirstOccurrenceString {
    public static void main(String[] args) {
        String haystack="texbooks";
        String needle="text";

        System.out.println(solve(haystack,needle));
    }
    public static int solve(String hayString, String needle){

        // for(int i=0;i<hayString.length()-needle.length()+1;i++){
        //     if(hayString.charAt(i)==needle.charAt(0)){
        //         if (hayString.substring(i, needle.length()+i).equals(needle)){
        //             return i;
        //         }
        //     }
        // }

        if(needle.isEmpty()) {
           return -1; 
        }
        int index = hayString.indexOf(needle);
        return index;
    }
    
}
