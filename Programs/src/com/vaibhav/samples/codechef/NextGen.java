package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class NextGen{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

           if(a*b <= x*y){
               System.out.println("Yes");
           }
           else {
               System.out.println("No");
           }
        }
    }
}
