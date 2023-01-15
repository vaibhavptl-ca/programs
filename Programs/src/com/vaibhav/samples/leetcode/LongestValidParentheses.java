package com.vaibhav.samples.leetcode;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {
        System.out.println(longestParenthesis("()()(())((()))"));
    }

    public static int longestParenthesis(String s){

        int result = 0;

        Stack<Integer> stack = new Stack();
        stack.push(-1);
        for(int i=0; i < s.length(); i++){
            char chars = s.charAt(i);

            if(chars == '('){
                stack.push(i);
            }
            else if (chars == ')'){
                stack.pop();
                if(stack.size() == 0){
                    stack.push(i);
                }else {
                    result = Math.max(result, i - stack.peek());
                }
            }
        }
        return result;
    }
}
