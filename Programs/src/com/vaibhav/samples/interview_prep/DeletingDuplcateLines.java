package com.vaibhav.samples.interview_prep;

import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeletingDuplcateLines {
    public static void main(String args[]) throws Exception {
        String filePath = "/Users/vaibhavpatel/Downloads/INC5799987_Customer_Email.csv";
        String input = null;
        //Instantiating the Scanner class
        Scanner sc = new Scanner(new File(filePath));
        //Instantiating the FileWriter class
        FileWriter writer = new FileWriter("/Users/vaibhavpatel/Downloads/outputBig.txt");
        //Instantiating the Set class
        Set set = new HashSet();

        writer.flush();
        System.out.println("Contents added............");
    }
}
