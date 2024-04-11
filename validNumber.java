// leetcode 65 
import java.util.regex.*;

public class validNumber{

    public static void main(String[] args) {
        String s = "53.5e93";
        System.out.println(isNumber1(s));
    }
    // one linear solution 
    public static boolean isNumber(String s) {
        String regex ="^[+-]?(((\\d+\\.\\d*)|(\\.\\d+))|(\\d+))([eE][+-]?\\d+)?$";

        return Pattern.matches(regex, s);
    }

    // can also be solved using loop & if-else statement 
    public static boolean isNumber1(String s){
        s = s.trim();

        boolean digitSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                digitSeen = true;
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                if (dotSeen || eSeen) {
                    return false;
                }
                dotSeen = true;
            } else if (c == 'e' || c == 'E') {
                if (eSeen || !digitSeen) {
                    return false;
                }
                eSeen = true;
                digitSeen = false;
            } else {
                return false;
            }
        }

        return digitSeen;
    }
}