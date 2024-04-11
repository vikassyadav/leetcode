import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
     String s = "{}{()()}";
     System.out.println(isValid(s));   
    }
    public static boolean isValid(String str) {
    Stack <Character> s =new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(isOpening(ch)){
            s.push(ch);
        }else if (s.isEmpty()){
            return false;
        }else if (!isMatching(s.peek(),ch)) {
            return false;
        }else{
            s.pop();
        }

    }
        return s.isEmpty();   
    }
    public static boolean isOpening(char c){
        return c=='(' || c=='[' || c=='{' ;

    }
    public static boolean isMatching(char a ,char b){
        return (a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']');
    }
}
