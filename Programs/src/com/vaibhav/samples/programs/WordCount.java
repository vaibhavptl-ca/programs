package com.vaibhav.samples.programs;

import java.util.HashMap;

public class WordCount {

    public static void main(String[] args){

        String str = "Alice is in wonderland and is a good time";
        wordCount(str);
    }

    public static HashMap wordCount(String str){

        HashMap<String, Integer> map = new HashMap<>();

        String[] words = str.split(" ");

        for(String word : words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+ 1);
            }
            else{
                map.put(word,1);
            }
        }
        System.out.println(map);
        return map;
    }


}
