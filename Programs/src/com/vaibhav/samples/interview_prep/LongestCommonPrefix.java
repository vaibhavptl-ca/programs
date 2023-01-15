package com.vaibhav.samples.interview_prep;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str ={"flower","flow","flight"};

        System.out.println(longestPrefix(str));

    }

    public static String longestPrefix(String[] str){

        if(str.length == 0) return "";

        String prefix = str[0];

        for(int i = 1; i < str.length; i++){

            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

}
