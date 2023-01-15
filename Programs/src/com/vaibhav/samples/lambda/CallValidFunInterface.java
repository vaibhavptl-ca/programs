package com.vaibhav.samples.lambda;

public class CallValidFunInterface {

    public static void main(String[] args){
        //Old Way to call methods
//        FunctionalInt callValidFunInterface = new FunctionalInt();
//        callValidFunInterface.runMethod();

//        ValidFunInterface callValidFunInterface = (a,b) -> System.out.println("Sum of a and b == "+(a+b));
//        callValidFunInterface.sumMethod(10,20);

//        ValidFunInterface callValidFunInterface1 = s -> s.length();
//        int len = callValidFunInterface1.lengthOfString("Lambda");
//        System.out.println(len);
//

        // Old method work
//        Calculations calculator = new Calculator();
//        int op = calculator.doCalc(100);
//        System.out.println(op);

        Calculations i = a -> {
            int x = a + 10;
            x = x/2;
            return  x;
        };

        int op = i.doCalc(100);
        System.out.println(op);
    }

}

//interface ValidFunInterface{
//
////    public void sumMethod(int a, int b);
//
//    public int lengthOfString(String s);
//}

//class Calculator implements Calculations{
//
//    @Override
//    public int doCalc(int a) {
//        int x = a + 10;
//        x = x/2;
//        return x;
//    }
//}

interface Calculations{

    public int doCalc(int a);

}