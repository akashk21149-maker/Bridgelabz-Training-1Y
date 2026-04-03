package com.gla.generics;
import java.util.ArrayList;

class Add<T>{
   T var1;
    T var2;
}
public class Example3<T extends Number> {
    public static void main(String[] args) {

        Add<Integer> obj = new Add<>();
        obj.var1 = 99;
        obj.var2 = 75;

        System.out.println(obj.var1 + obj.var2);

    }
}
