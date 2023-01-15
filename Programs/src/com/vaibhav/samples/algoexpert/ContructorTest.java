package com.vaibhav.samples.algoexpert;

public class ContructorTest {
        int id;
        String name;
        static String college = "WORLD";

         //Copying of constructor
        ContructorTest(int i, String n){
            id = i;
            name = n;
        }

        ContructorTest(ContructorTest c){
            id = c.id;
            name = c.name;
        }

        void display(){System.out.println(id+" "+name + " "+college);}

        public static void main(String args[]){
            ContructorTest s1=new ContructorTest(111,"vaibhav");
            ContructorTest s2=new ContructorTest(s1);
            s1.display();
            s2.display();
        }



}


