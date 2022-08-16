package com.vaibhav.samples.programs;

public class PalindromeChecker {

    public static void main(String[] args){

        String str = "Too hot to hoot.";
        if( isSentencePalindrome(str))
            System.out.println("Sentence is palindrome");
        else
            System.out.println("Sentence is not palindrome");
    }


    public static boolean isSentencePalindrome(String s){
        int l = 0;
        int h = s.length() -1;

        s = s.toLowerCase();

        while (l <= h){

            char getAtl = s.charAt(l);
            char getAth = s.charAt(h);

            if(!(getAtl >= 'a' && getAtl <= 'z')) l++;

           else if(!(getAth >= 'a' && getAth <= 'z')) h--;

           else if (getAtl == getAth) {
               l++;
               h--;
            }
           else return  false;
        }
        return true;
    }

}
