// leetcode 20

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
     String s = "{}{()()}";
     System.out.println(isValid(s));   
    }
    public static boolean isValid(String str) {  // 2ms to compilr
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

// method 2 using Deque
public static boolean isValid2(String str){   // 1ms to compile
    Deque<Character> stack = new ArrayDeque<>();
    for (final char c : str.toCharArray()) {
        if (c=='(') {
            stack.push(')');
        }else if (c=='{') {
            stack.push('}');
        }else if (c=='[') {
            stack.push(']');
        }else if (stack.isEmpty() || stack.pop()!=c) {
            return false;
        }
    }
    return stack.isEmpty();
}
    // method  3
    public boolean isValid3(String s) {
        // create a stack to store opening parentheses
        Stack<Character> stack = new Stack<>();
        
        // loop through the string
        for (int i = 0; i < s.length(); i++) {
            // get the current character
            char c = s.charAt(i);
            
            // if the current character is an opening parentheses
            if (c == '(' || c == '{' || c == '[') {
                // push it onto the stack
                stack.push(c);
            }
            // if the current character is a closing parentheses
            else if (c == ')' || c == '}' || c == ']') {
                // if the stack is empty, return false
                if (stack.isEmpty()) {
                    return false;
                }
                // pop the top element from the stack
                char top = stack.pop();
                // if the current character and the top element from the stack don't match, return false
                if (c == ')' && top != '(' || c == '}' && top != '{' || c == ']' && top != '[') {
                    return false;
                }
            }
        }
        // if the stack is not empty at the end, return false
        if (!stack.isEmpty()) {
            return false;
        }
        // return true
        return true;
    }
}
