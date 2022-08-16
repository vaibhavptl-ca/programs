package com.vaibhav.samples.prep;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        char[] c = str.toCharArray();
        String reversedString = "";
       for(int i = str.length()-1; i>=0; i--){
           reversedString += c[i];
       }
        return reversedString;
    }

}
