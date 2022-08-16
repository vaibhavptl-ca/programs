package com.vaibhav.samples.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) {

     reverseString("the sky is blue");

    }

    public static void reverseString(String str){

        String[] s = str.split(" ");

        List listOfWords = Arrays.asList(s);

        Collections.reverse(listOfWords);

        for(String sr: s){
            System.out.print(" "+ sr);
        }
    }
}
