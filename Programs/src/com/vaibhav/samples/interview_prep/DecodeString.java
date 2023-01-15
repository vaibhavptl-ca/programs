package com.vaibhav.samples.interview_prep;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {

        System.out.println(decodeString("3[a]2[c]"));

    }

    public static String decodeString(String str){
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int length  = str.length();

        for (int i = 0 ;i < length; i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                int num = ch - '0';
                while (i+1 < length && Character.isDigit(str.charAt(i+1))){
                    num = num * 10 + str.charAt(i+1)-'0';
                    i++;
                }
                numStack.push(num);
            }
            else if( ch == '['){
                stringStack.push(sb.toString());
                sb = new StringBuilder();
            }
            else if ( ch == ']')
            {int k = numStack.pop();
                StringBuilder tmp = new StringBuilder(stringStack.pop());
                for(int j = 0; j< k; j++){
                    tmp.append(sb);
                }
                sb = tmp;
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
