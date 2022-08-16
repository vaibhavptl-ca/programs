package com.vaibhav.samples.prep;

public class PalindromeChecker {

    public static void main(String[] args){
        System.out.println(palindrome("Kanak"));
    }

    static boolean palindrome(String s){
        int length = s.length();
        for(int i = 0 ; i < length/2; i++){
            if(s.toLowerCase().charAt(i) != s.toLowerCase().charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
