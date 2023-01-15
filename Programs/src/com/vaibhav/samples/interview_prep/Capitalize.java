package com.vaibhav.samples.interview_prep;

public class Capitalize {

    public static void main(String[] args){

        String str = "hello vaibhav how are you?";

        System.out.println(capWord(str));
    }

    public static String capWord(String str){

        String[] sa = str.split(" ");


        String capStatement ="";

        for(int i = 0 ; i < sa.length; i++){

            String word = sa[i];

            char[] ca = word.toCharArray();

            String firstChar = String.valueOf(ca[0]);
            String capWord = firstChar.toUpperCase();

            for(int j = 1; j <ca.length; j++){
                capWord += ca[j];
            }

             capStatement= capStatement + capWord + " ";
        }

        return capStatement;
    }
}
