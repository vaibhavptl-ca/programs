package com.vaibhav.samples.generics;

public class Data<T> implements IData<T>{

    private T data;

    public Data(T data){
        this.data = data;
    }

    @Override
    public T getdata() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                '}';
    }
}
