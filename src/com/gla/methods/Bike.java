package com.gla.methods;

public class Bike {
    String name;
    String company;
     String model;
     int number_plate;


    public Bike(String name, String company, String model, int number_plate) {
        this.name = name;
        this.company = company;
        this.model = model;
        this.number_plate = number_plate;
    }
    void company(){
        System.out.println(company);
    }
    public static void main(String[] args){
        Bike b1 = new Bike("Alice" , "Kawasaki" ,"TVS", 7214);
        b1.company();
    }
}
