package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class ShoppingChange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int returnedAmount = 100 - x;
            System.out.println(returnedAmount);
        }
    }
}
