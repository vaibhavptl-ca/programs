package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class MatchProblem {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int[] arr = {6,2,5,5,4,5,6,3,7,6};
            int sum = a + b;
            int matches = 0;

            while(sum != 0){
                int x = sum % 10;
                matches+= arr[x];
                sum  = sum / 10;
            }
            System.out.println(matches);
        }
    }
}
