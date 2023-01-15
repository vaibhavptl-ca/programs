package com.vaibhav.samples.algoexpert;//package com.vaibhav.samples;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
//import java.util.concurrent.CountDownLatch;
//
//public class MaxSS {
//
//    /**
//     * The Main class implements an application that reads lines from the standard input
//     * and prints them to the standard output.
//
//        /**
//         * Iterate through each line of input.
//         */
//        public static void main(String[] args) throws IOException {
//            InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//            BufferedReader in = new BufferedReader(reader);
//            String line;
//            while ((line = in.readLine()) != null) {
//                maxSSCaluclation(line);
//            }
//        }
//
//        public static void maxSSCaluclation(String line){
//
//            ArrayList<String> cases = new ArrayList<String>(50);
//
//            while(line != null){
//                if (line.compareTo("")!=0)
//                    cases.add(line);
//            }
//
//            double[] result= new double[cases.size()];
//
//            String[][] caseInfo=new String[2][];
//
//            CountDownLatch countDownLatch = new CountDownLatch(cases.size());
//
//            for (int i=0; i<cases.size(); ++i)
//            {
//                if ( !caseCheck(cases.get(i), caseInfo) )
//                {
//                    countDownLatch.countDown();
//                    continue;
//                }
//                else
//                {
//                    String[] customers=caseInfo[0];
//                    String[] products=caseInfo[1];
//
//                    SubThread subThread= new SubThread(i, customers, products, result, countDownLatch);
//                    //->Multi-threads
//                    subThread.start();
//                }
//            }
//
//            countDownLatch.await();
//            for (int i=0; i<result.length; ++i)
//                out.printf("%.2f\n", result[i]);
//        }
//    }