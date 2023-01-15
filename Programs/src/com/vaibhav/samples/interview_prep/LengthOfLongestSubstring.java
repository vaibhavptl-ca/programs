package com.vaibhav.samples.interview_prep;

import java.util.HashMap;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfString("abcabcbb"));

    }

    public static int lengthOfString(String s){

        int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                i = map.get(ch);
                map.clear();
            }

            if(map.size() > result){
                result = map.size();
                String longestString = map.keySet().toString();
            }
        }
        return result;
    }
}
