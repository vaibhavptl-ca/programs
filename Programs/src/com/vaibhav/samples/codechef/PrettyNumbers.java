package com.vaibhav.samples.codechef;

import java.util.Scanner;

public class PrettyNumbers {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i  = 0 ;i<t ; i++){
            int count = 0;
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int j = l; j <=r ; j++) {
                int checkNumber = j%10;
                if (checkNumber == 2 || checkNumber == 3 || checkNumber == 9)
                    count++;
            }
        System.out.println(count);
        }
    }
}
