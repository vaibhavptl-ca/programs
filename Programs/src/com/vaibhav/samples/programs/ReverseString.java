package com.vaibhav.samples.programs;

public class ReverseString {

    public static void main(String[] args){
        String str = "HelloWorld";
        reverseString(str);

    }

    public static void reverseString(String str){
        String newString = "";
        for(int i =0; i <str.length(); i++){
            char ch = str.charAt(i);
            newString = ch+newString;
        }
        System.out.println("Reversed word is : "+ newString);
    }
}
