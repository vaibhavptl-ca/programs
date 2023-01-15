package com.vaibhav.samples.spotify;


public class RegexRemoveChars {
    public static void main(String[] args){

        String str ="124$#23 Hell2&%&$oo World@##24";
        System.out.println(str.replaceAll("[^a-zA-Z]",""));

        System.out.println(str.replaceAll("\\s",""));

    }

}

