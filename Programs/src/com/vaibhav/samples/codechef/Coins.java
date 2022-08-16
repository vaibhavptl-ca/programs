package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0 ; i < t ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int value = x*10 + y *5;
            System.out.println(value);
        }
    }
}
