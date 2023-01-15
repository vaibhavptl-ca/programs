package com.vaibhav.samples.algoexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    /**
     * The Main class implements an application that reads lines from the standard input
     * and prints them to the standard output.
     */

        public static void main(String[] args) throws IOException {
            Set<Inputs> liSet = new TreeSet<Inputs>(new CompareString());
            int topCounts = 0;
            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
            BufferedReader in = new BufferedReader(reader);
            String line;
            while ((line = in.readLine()) != null) {
                line = line.trim();
                if(!"".equals(line)){
                    liSet.add(new Inputs(line.length() , line));
                }
            }

                int count = 0;
                for(Inputs i: liSet){
                    System.out.println(i.line);
                    if(++count == topCounts){
                        break;
                    }
                }
        }
}

class Inputs{
    Integer length;
    String line;

    public Inputs(Integer l , String line){
        length = l;
        this.line = line;
    }
}

class CompareString implements Comparator<Inputs> {

    public int compare(Inputs i1, Inputs i2){
        if(i2.length > i1.length){
            return 1;
        }
        else {
            return -1;
        }
    }
}