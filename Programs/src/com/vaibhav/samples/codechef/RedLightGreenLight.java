package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class RedLightGreenLight {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int players = sc.nextInt();
            int height = sc.nextInt();
            int sum = 0;
            for (int k = 0; k < players; k++) {
                int heightOfPlayers = sc.nextInt();
                if (heightOfPlayers > height) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
