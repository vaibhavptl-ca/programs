package com.vaibhav.samples.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args){
        System.out.println(fizBuzz(10));
    }

    public static List<String> fizBuzz(int n){

        ArrayList<String> list = new ArrayList();
        for(int i= 1; i <=n ; i++){
            if(i % 3 == 0 &&  i%5 == 0){
                list.add("FizzBuzz");
            }
            else if(i%5 == 0){
                list.add("Buzz");
            }
            else if(i%3 == 0){
                list.add("Fizz");
            }
            else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
