package com.vaibhav.samples.interview_prep;

import java.util.HashMap;

public class Occurences {
    public static void main(String[] args){

        HashMap<Character, Integer> hellooo_worldd = countOccurences("Hellooo Worldd");
        System.out.println(hellooo_worldd);
    }

    public static HashMap<Character, Integer> countOccurences(String str){

        char[] ch = str.replaceAll("\\s","").toLowerCase().toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c: ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        return map;
    }

}
