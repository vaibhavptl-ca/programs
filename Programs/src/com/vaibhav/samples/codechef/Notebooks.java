package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class Notebooks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int totalNotebBooks = n * 10;
            System.out.println(totalNotebBooks);
        }
    }
}