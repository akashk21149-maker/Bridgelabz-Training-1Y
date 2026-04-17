package com.gla.collection;
import java.util.*;
public class HashhSettExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(45);
        set.add(56);
        set.add(78);
        set.add(92);
        set.add(24);

        System.out.println(set);
        System.out.println(set.remove(24));
        System.out.println(set.size());
        System.out.println(set.contains(24));

        // method1 for iterate(for each loop)
        for(int val : set){
            System.out.println(val+" ");
        }
        //   method2 for iterate
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}
