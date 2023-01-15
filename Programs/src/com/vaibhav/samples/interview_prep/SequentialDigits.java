package com.vaibhav.samples.interview_prep;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {

    public static void main(String[] args) {
        System.out.println(sequentialDigits(100,300));
    }

    public static List<Integer> sequentialDigits(int low, int high){
        String digits = "123456789";
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 9 ; i++){
            for(int j = 0; j < digits.length()-i ; j++){
                String substring = digits.substring(j,i+j);
                int value = Integer.parseInt(substring);

                if(value >= low && value <= high){
                    list.add(value);
                }
            }
        }
        return list;
    }
}
