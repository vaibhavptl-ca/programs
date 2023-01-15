package com.vaibhav.samples.interview_prep;

public class CompareArrays {

    public static void main(String[] args){

        int[] a = {1,4,5,2,3};
        int[] b = {1,4,5,2,3};

        compare(a,b);

    }

    public static boolean compare(int[] a, int[] b){
        if(a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                    if (a[i] != b[i]) {
                        return false;
                    }
                }
            System.out.println("Valid Equal Arrays");
        }
        else {
            System.out.println("Invalid Array length so no comparison");
        }
        return true;
    }
}
