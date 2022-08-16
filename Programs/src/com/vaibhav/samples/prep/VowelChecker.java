package com.vaibhav.samples.prep;

public class VowelChecker {

    public static void main(String[] args){
        System.out.println(vowelChecker("h"));
    }

    static boolean vowelChecker(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
