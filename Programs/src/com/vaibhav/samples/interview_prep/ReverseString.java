package com.vaibhav.samples.interview_prep;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s){
        char[] ch = s.toCharArray();
    String reversedString ="";

        for(int i = ch.length-1 ; i>=0; i--){
            reversedString+=ch[i];
        }
        return  reversedString.toLowerCase();
    }
}
