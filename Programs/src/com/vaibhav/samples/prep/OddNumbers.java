package com.vaibhav.samples.prep;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < 100; i++){
         list.add(i);
        }
        System.out.println(oddChecker(list));

    }

    public static boolean oddChecker(List<Integer> integers){
        for(Integer i : integers){
            if(i%2 == 0)
                return false;
        }
        return true;
    }

    public static boolean odd(List<Integer> integers){
        return integers.parallelStream().anyMatch(x -> x % 2 != 0);
    }
}

