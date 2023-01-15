package com.vaibhav.samples.programs;

import java.util.HashMap;

public class CountOccurences {

    public static void main(String[] args){
        String str = "HelloWorld";
        countOccurences(str);
        countOfEachOccurences(str);
    }

    public static HashMap countOccurences(String str){

        HashMap<Character,Integer> map = new HashMap();
        char[] resultCount = str.toCharArray();

        for(char result : resultCount){

            if(map.containsKey(result)){
                map.put(result,map.get(result) + 1);
            }
            else {
                map.put(result,1);
            }
        }
        System.out.println(map);
        return map;
    }

    public static void countOfEachOccurences(String str){
        int count[] = new  int[256];
        int len = str.length();

        for(int i=0; i < len; i++){
            count[str.charAt(i)]++;
        }

        char[] ch = new char[str.length()];
        for(int i = 0; i< len; i++){
            ch[i] = str.charAt(i);
            int find = 0;
            for(int j=0;j<=i; j++){

                if(str.charAt(i) == ch[j]){
                    find++;
                }

                if(find ==1){
                    System.out.println("No of Occurences "+ str.charAt(i)+ " is :"+ count[str.charAt(i)]);
                }
            }
        }

    }

}
