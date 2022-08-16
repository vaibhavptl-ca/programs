package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class CarOrBus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int bike = sc.nextInt();
            int car = sc.nextInt();

            if( bike < car){
                System.out.println("BIKE");
            }
            else if (bike > car){
                System.out.println("CAR");
            }
            else {
                System.out.println("SAME");
            }
        }
    }
}
