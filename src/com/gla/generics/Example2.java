package com.gla.generics;
import java.util.ArrayList;
class Car<T>{    // make any class in generic class
    T var1;
    T var2;
}
public class Example2 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList();

        Car<Integer> car = new Car<>();
         car.var1 = 2000;
         car.var2 = 3000;

         System.out.println(car.var1);
        System.out.println(car.var2);
    }
}
