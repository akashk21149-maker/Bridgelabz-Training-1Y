package com.gla.collection;
import java.util.*;
public class MappExample {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("Akash", 99);
        map.put("Akki", 76);
        map.put("Ashu", 92);
        map.put("Anshu", 55);
        map.put("Akash", 100);

        System.out.println(map);
        System.out.println(map.get("Akash"));
        System.out.println(map.containsKey("Ashu"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

        // for each loop
        for(String key: map.keySet()){
            System.out.println(map.get(key)); // print values of key
            System.out.println(key);
        }
//        System.out.println(map.keySet());
//        System.out.println(map.values());
    }
}
