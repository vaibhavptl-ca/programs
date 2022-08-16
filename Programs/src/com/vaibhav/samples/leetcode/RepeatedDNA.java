package com.vaibhav.samples.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepeatedDNA {

    public static void main(String[] args) {

        String s = "AAAAACCCCCAAAAACCCCCDGETTT";

        System.out.println(repeatedDNABySET(s));
    }

    public static List<String> repeatedDNA(String s){

        Map<String,Integer> map = new HashMap<>();

        for(int i=0; i<s.length()-10;i++){
            String substring = s.substring(i, i+10);
            map.put(substring,map.getOrDefault(substring,0)+1);
        }

        List<String> list = new ArrayList<>();

        for(Map.Entry<String,Integer> item: map.entrySet()){
            if(item.getValue()>1){
                list.add(item.getKey());
            }
        }
        return list;
    }

    public static List<String> repeatedDNABySET(String s){

        Set<String> set = new HashSet<>();
        Set<String> listOfStrings = new HashSet<>();

        for(int i = 0 ; i< s.length()-10; i++){
            String subString = s.substring(i, i+10);
            if(set.contains(subString)){
                listOfStrings.add(subString);
            } else {
              set.add(subString);
            }
        }
        return new ArrayList<>(listOfStrings);
    }
}
