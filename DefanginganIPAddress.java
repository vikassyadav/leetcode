// leetcode 1108
public class DefanginganIPAddress {
    public static void main(String[] args) {
        String s = "1.1.1.1";
        System.out.println(defagStringC(s));

    }
    // method 1  using extra space(new string)
    public static String defagStringA(String address){
        int n =address.length();
        String s ="";
        for(int i=0;i<n;i++){
            char c = address.charAt(i);
            if(c!='.'){
                s+=c;
            }else{
                s+="[.]";
            }
        }
        return s;
    }

    //method 2  using bufferReader  takes less Runtime
    public static String  defagStringB(String address){
        StringBuilder sb =new StringBuilder();
        int n = address.length();
        for(int i=0; i<n;i++){
            char c = address.charAt(i);
            if(c!='.'){
                sb.append(c);
            }else{
                sb.append("[.]");
            }
        }
        // string builder rutrun object convert it into 
        // string using "toString" Method
        return sb.toString();
    }


    // Method 3 using RegX 
    // Remember that replaceAll returns a new string with 
    // the replacements applied; it does not modify the original string.

    public static String defagStringC(String address){

        return address.replaceAll("\\.","[.]");
    }
}


/*  LEARN ABOUT ReplaceAll USING regX
 * Regular Expression Pattern: The first parameter of replaceAll is a string representing the regular expression pattern. 
 * This pattern specifies the substring or character sequence to be replaced. You can use various regex constructs to create more complex patterns. For example:


 Pattern in regX with ReplaceAll();
                                        "\d": Matches any digit (0-9).
                                        "\s": Matches any whitespace character (space, tab, newline, etc.).
                                        "\\bword\\b": Matches the word "word" as a whole word (using word boundaries).
                                        "pattern1|pattern2": Matches either pattern1 or pattern2.

        code

public class Main {
    public static void main(String[] args) {
        String originalString = "apple banana 123 orange";

        // Replace all digits with 'x'
        String replacedString1 = originalString.replaceAll("\\d", "x");
        System.out.println("Replaced digits: " + replacedString1);

        // Replace all whitespace characters with a hyphen
        String replacedString2 = originalString.replaceAll("\\s", "-");
        System.out.println("Replaced whitespace: " + replacedString2);

        // Replace words "apple" or "orange" with "fruit"
        String replacedString3 = originalString.replaceAll("\\b(apple|orange)\\b", "fruit");
        System.out.println("Replaced words: " + replacedString3);
    }
}

        output

Replaced digits: apple banana xxx orange
Replaced whitespace: apple-banana-123-orange
Replaced words: fruit banana 123 fruit



 */