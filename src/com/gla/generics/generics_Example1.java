package com.gla.generics;
import java.util.ArrayList;

public class generics_Example1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(25);
        list.add("akash");
        list.add(25.6);

//   String o = (String) list.get(1);
//    String obj = (String) list.get(0);    // Type Safety => it doesnot give error at compile time but give error in runtime

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
    }
}
