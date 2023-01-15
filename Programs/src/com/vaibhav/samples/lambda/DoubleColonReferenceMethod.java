package com.vaibhav.samples.lambda;

public class DoubleColonReferenceMethod {

    public static void main(String[] args){
        // Normal way of calling the method reference on Interface.
        MyFunctionalInterface functionalInterface = () -> System.out.println("I am Lambda");
        functionalInterface.method1();
    }

    public static void method2(){
        System.out.println("I am not a Lambda");
    }

    public void method3(){
        System.out.println("I am an Instance method");
    }
}


interface MyFunctionalInterface{
    void method1();
}


class CallingClass{

    public static void main(String[] args){

        // Now using the method reference call using :: Operator (Static Methods)
        MyFunctionalInterface functionalInterface = DoubleColonReferenceMethod :: method2;
        functionalInterface.method1();

        // Noww using the method reference for Instance Method, hence create object of the class
        DoubleColonReferenceMethod doubleColonReferenceMethod = new DoubleColonReferenceMethod();
        MyFunctionalInterface myFunctionalInterface = doubleColonReferenceMethod :: method3;
        myFunctionalInterface.method1();

        //Constructor Reference
        Details d = Student :: new;
        Student s = d.getStudent("Vaibhav");

    }
}

class Student{
    Student(String name){
        System.out.println("Student Name is "+ name);
    }
}


interface Details{
    public Student getStudent(String name);
}