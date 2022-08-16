package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class SquidGame {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0 ; i < t; i++){
            int player = sc.nextInt();
            int sum = 0;
            int[] arr = new int[player];
            for(int j = 0 ; j < player; j++){
                arr[j] += sc.nextInt();
                sum += arr[j];
            }
            int max = sum - arr[0];
            for(int k=0; k <arr.length; k++){
                if(sum - arr[k] > max){
                    max = sum -arr[k];
                }
            }
            System.out.println(max);
        }
    }
}
