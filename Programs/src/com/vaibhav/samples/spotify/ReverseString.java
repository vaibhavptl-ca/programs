package com.vaibhav.samples.spotify;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public static void main(String[] args){
        System.out.println(reverseString(" Hello World"));
        reverseEachWord("Hello Vaibhav PAtel");
        reverseEachWordPositionByCollections("Hello Vaibhav PAtel");
    }

    public static String reverseString(String str){

        String reversedStr = "";

        char[] ch = str.replaceAll("\\s","").toLowerCase().toCharArray();

        for (int i = ch.length -1 ; i>=0 ; i--){
            reversedStr+=ch[i];
        }

        return reversedStr;

    }



    public static String reverseEachWord(String str){

        String[] words = str.split(" ");
        String reversedStr = "";

        for(String word : words){

            String reversedWord = "";

            for(int i = word.length()-1 ; i>=0; i--){
                reversedWord+= word.charAt(i);
            }
            reversedStr += reversedWord+ " ";
        }
        System.out.println("Reversed "+reversedStr);
        return reversedStr;
    }

    public static void reverseEachWordPositionByCollections(String str){

        String[] s = str.split(" ");

        List listOfWords = Arrays.asList(s);

        Collections.reverse(listOfWords);

        for(String sr: s){
            System.out.print(" "+ sr);
        }

    }
}
