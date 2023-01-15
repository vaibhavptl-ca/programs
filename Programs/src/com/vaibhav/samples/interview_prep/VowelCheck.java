package com.vaibhav.samples.interview_prep;

public class VowelCheck {

    public static void main(String[] args) {
        String s = " Hello";
        System.out.println(vowelChecker(s));

    }

    public static boolean vowelChecker(String s){
        return  s.toLowerCase().matches(".*[aeiou].*");
    }
}
