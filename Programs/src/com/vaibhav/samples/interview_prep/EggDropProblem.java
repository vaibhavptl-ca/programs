package com.vaibhav.samples.interview_prep;

public class EggDropProblem {

    public static void main(String[] args){
        int i = eggDrop(1, 2);
        System.out.println(i);
    }
    static int eggDrop(int n, int k)
    {
        if(n==1)
            return k;
        if(k==1)
            return 1;
        int mid = (k+1)/2;
        if((k-mid) > (mid-1))
            return 1+eggDrop(n, k-mid);
        else
            return 1+eggDrop(n-1, mid-1);
    }
}
