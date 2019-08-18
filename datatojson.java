package com.company;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.StringWriter;


public class Main {


    public static void main(String[] args) {
        System.out.println("Ok");


        ObjectMapper mapper = new ObjectMapper();
        Car obj = new Car();
        try{
            String temp = mapper.writeValueAsString(obj);
            System.out.println(temp);

        }catch(Exception e) {
            System.out.println(e);
        }

    }
}


public class Car {

    public String carname;
    public int year ;

    public Car(String name, int year) {
        this.carname = name;
        this.year = year;
    }

    public Car() {
        this.carname = "Test";
        this.year = 1234;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printer(){
        System.out.println("Car :"+this.carname +"Year"+this.year);
    }

}
