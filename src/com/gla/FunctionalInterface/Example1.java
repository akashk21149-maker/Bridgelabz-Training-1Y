package com.gla.FunctionalInterface;
import java.util.*;
interface Employee{
    public String getName();
}
//class SoftwareEngineer implements Employee{
//    public String getName(){
//        return "Software Engineer";
//    }
//}
//class DataEngineer implements Employee{
//    public String getName(){
//        return "Data Engineer";
//    }
//}


public class Example1 {
    public static void main(String[] args) {
        Employee obj = () -> "Data Engineer";
        System.out.println(obj.getName());

        Employee obj2 = () -> "Software Engineer";
        System.out.println(obj2.getName());


        Runnable obj3 = () -> {

            for (int i = 0; i <= 10; i++) {
                System.out.println("Thread" + i);
            }
        };
        Thread t = new Thread(obj3);
        t.start();
    };

}





