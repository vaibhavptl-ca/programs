package interview_prep;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(parentheses("(()()){}}{[][]]["));
        System.out.println(parentheses("((){}[])"));


    }

    public static boolean parentheses(String str){

        Stack<Character> stack = new Stack<>();
        boolean result ;
        if(str == null || str.length() == 0){
            return false;
        }
        else {

            for(int i = 0 ; i <str.length(); i++){
                if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                    stack.push(str.charAt(i));
                }else if(str.charAt(i) == ')') {
                    if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
                else if(str.charAt(i) == '}') {
                    if(!stack.isEmpty() && stack.peek() == '{'){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
                else if(str.charAt(i) == ']') {
                    if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }

         result = stack.isEmpty() ? true : false;
        }
        return  result;
    }
}
