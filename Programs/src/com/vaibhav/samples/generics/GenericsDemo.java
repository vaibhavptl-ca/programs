package com.vaibhav.samples.generics;

public class GenericsDemo {

    public static void main(String[] args){

        Data<String> d = new Data<>("This is Demo 1");
        System.out.println(d.toString());

        Data<Integer> d1 = new Data<>(10);
        System.out.println(d1);

        Data<Float> f = new Data<>(10.5f);
        System.out.println(f);

        IData<String> iData = new Data<>("Hello to the Interface");
        System.out.println(iData.getdata());
    }
}
