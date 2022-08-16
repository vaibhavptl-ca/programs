package com.vaibhav.samples.programs;

public class RemoveWhiteSpaces {

    public static void main(String[] args){

        String str = "   Hello   World   ";

        str = str.replaceAll("\\s","");

        System.out.println(str);
    }
}
