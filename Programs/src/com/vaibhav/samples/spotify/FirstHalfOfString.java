package com.vaibhav.samples.spotify;

public class FirstHalfOfString {

    public static void main(String[] args){

        String str = " Hello To the best computer";

        printHalf(str);
    }

    public static String printHalf(String str){

        int fisrtHalf = str.length()/2;

        String substring = str.substring(0, fisrtHalf);

        System.out.println(substring);

        return substring;
    }
}
