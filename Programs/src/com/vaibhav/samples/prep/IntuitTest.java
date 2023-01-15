package com.vaibhav.samples.prep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

public class IntuitTest {
    /*
    * Get top 3 cities with high temperature
    * */

    public static void main(String[] args) throws IOException {
        cityTemp();
    }

    public static void cityTemp() throws IOException {

        String line = "";
        String splitBy = ",";

        HashMap<String,Integer> map = new HashMap<>();

        try
        {
            List<City> list = new ArrayList<>();
            IntuitTest i = new IntuitTest();
            BufferedReader br = new BufferedReader(new FileReader("/Users/vaibhavpatel/Downloads/gap-applications/Programs/src/com/vaibhav/samples/prep/temp.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] city = line.split(splitBy);    // use comma as separator
                City cityObject = new City(city[0], Integer.parseInt(city[1]),
                       Integer.parseInt(city[2]), Integer.parseInt(city[3]));
                list.add(cityObject);

                // Use of Predicate
                Predicate<Integer> predicate = p -> p >= 75;
                boolean result = predicate.test(Integer.parseInt(city[2]));

                System.out.println(" City Name : "+ city[0] +" Temparature : "+ Integer.parseInt(city[2]) + " Is it higher than the average Temp : "+result);
            }


            // Another syntax but not working
            //List<City> collectData = list.stream().sorted((i1, i2) -> i2.getTemperature()
              //      .compareTo(i1.getTemperature())).collect(Collectors.toList());

            Collections.sort(list, (o1,o2) -> {
                if(o1.getTemperature() > o2.getTemperature()){ return -1;}
                else if (o1.getTemperature() < o2.getTemperature()) {return 1;}
                else {return 0;}
            });

            List<City> cities = list.subList(list.size() - 3, list.size());

            cities.forEach((topCity) -> {System.out.println(topCity.getCity());});


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String toString(City city){

        return " Name=" + city.getCity() +
                ", Humid=" + city.getHumid() +
                ", Temp=" + city.getTemperature() +
                ", Wind=" + city.getWind();
    }
}

class City{
    String city;
    int humid;
    int temperature;
    int wind;

    public City(String city, int humid, int temperature, int wind) {
        this.city = city;
        this.humid = humid;
        this.temperature = temperature;
        this.wind = wind;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHumid() {
        return humid;
    }

    public void setHumid(int humid) {
        this.humid = humid;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }
}