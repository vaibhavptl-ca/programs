package com.vaibhav.samples.intuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intuit {

    // list of data
    // attributes - temp, pressure, humidity
    // k = 3

    public static void main(String[] args) {

        WeatherData data1 = new WeatherData(1,"London",20,35,12);
        WeatherData data2 = new WeatherData(1,"SF",30,25,22);
        WeatherData data3 = new WeatherData(1,"SJ",40,15,19);
        WeatherData data4 = new WeatherData(1,"SD",60,20,20);
        WeatherData data5 = new WeatherData(1,"Mexico",70,13,18);

        List<WeatherData> list = new ArrayList<>();
        list.add(data1);
        list.add(data2);
        list.add(data3);
        list.add(data4);
        list.add(data5);

        getTopKCities(list, "temp", 2);

    }


    public static void getTopKCities(List<WeatherData> data, String stats, int k){
        List<String> dataList = new ArrayList<>();
        HashMap<String,WeatherData> map = new HashMap<>();

        for(WeatherData str : data){

        }

    }
}

class WeatherData{

    public int id;
    public String city;
    public int temp;
    public int pressure;
    public int humidity;

    public WeatherData(int id, String city, int temp, int pressure, int humidity) {
        this.id = id;
        this.city = city;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString(){
        return city + " " + temp + " " + pressure + " " + humidity +" ";
    }
}
