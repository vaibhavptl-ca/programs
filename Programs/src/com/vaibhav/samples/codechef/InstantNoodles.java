package com.vaibhav.samples.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InstantNoodles {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        String b[]=a.split("\\s");
        int X=Integer.parseInt(b[0]);
        int Y=Integer.parseInt(b[1]);
        int p=X*Y;
        System.out.println(p);
    }
}
