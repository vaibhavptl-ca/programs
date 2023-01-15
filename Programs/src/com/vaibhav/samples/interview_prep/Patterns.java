package com.vaibhav.samples.interview_prep;

public class Patterns {

    public static void main(String args[]){
        int i, j,row= 5;

        // prints Triangle
        for (i = 1; i<=row; i++)
        {
            for (j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (i = 1; i<=row; i++)
        {
            for (j = 1; j<=row; j++){
                if(i==1 || i ==5 || j==1|| j==5) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------");
        for (i = 1; i<=row; i++)
        {
            for (j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------");

        for (i = 1; i<=row; i++)
        {
          for(j=i; j<=row; j++){
              System.out.print("  ");
          }
          for(j=1; j<=i; j++){
              System.out.print("* ");
          }
            System.out.println();
        }

        System.out.println("----------------------");

        for (i = 1; i<=row; i++)
        {
            for (j = i; j<=row; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("----------------------");

        for (i = 1; i<=row; i++)
        {
            for (j = 1; j<=i; j++){
                System.out.print("  ");
            }
            for (j=i; j<=row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        for (i = 1; i<=row; i++)
        {
            for(j=i; j<=row; j++){
                System.out.print("  ");
            }
            for(j=1; j<i; j++){
                System.out.print("* ");
            }
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
