package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class Assignments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            if(10-b <3){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
