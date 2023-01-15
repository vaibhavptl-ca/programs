package com.vaibhav.samples.interview_prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "graaamn";
        anagramChecker(s1,s2);

        String[] strs = {"eat","ate","tea","bap","cat"};
        System.out.println(groupAnagrams(strs));
    }

    private static void anagramChecker(String s1, String s2) {
         s1.replaceAll("\\s","");
         s2.replaceAll("\\s","");

         boolean status = true;

         if(s1.length()!= s2.length()) status = false;
         else {
             char[] ch1 = s1.toCharArray();
             char[] ch2 = s2.toCharArray();
             Arrays.sort(ch1);
             Arrays.sort(ch2);
             status = Arrays.equals(ch1,ch2);
         }
         if(status){
             System.out.println("Anagram");
         }else {
             System.out.println("Not an Anagram");
         }
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();

        for(String word: strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String str = new String(ch);

            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
                map.get(str).add(word);
            }
        }
        return new ArrayList<>(map.values());
    }
}
