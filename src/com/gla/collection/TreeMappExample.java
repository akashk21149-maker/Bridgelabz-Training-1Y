package com.gla.collection;
import java.util.*;
public class TreeMappExample {
    public static void main(String[] args) {
//        TreeMap<String , Integer> map = new TreeMap<>();  // For ascending order in key
        TreeMap<String , Integer> map = new TreeMap<>(Comparator.reverseOrder());  // for descending order of key

        map.put("Akash", 99);
        map.put("Sarthak", 76);
        map.put("Ishu", 92);
        map.put("Priyanshu", 55);

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

    }
}
