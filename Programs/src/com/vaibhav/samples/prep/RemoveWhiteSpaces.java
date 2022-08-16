package com.vaibhav.samples.prep;

public class RemoveWhiteSpaces {

    public static void main(String[] args){
        System.out.println(whiteSpace("  abc  def\\t"));
//        whiteSpaceRemoval();

    }

    public static String whiteSpace(String s){
        return s.replaceAll("\\s","");
    }

//    public static void whiteSpaceRemoval(){
//        String s = "  abc  def\\t";
//        s = s.strip().stripLeading();
//        System.out.println(s);
//    }
}
