package com.gla.ArrayList;

import java.util.ArrayList;
public class Example1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Akash");
        list.add("Anshu");
        list.add("Ashu");
        list.add("GLA");

        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println(list.size());
        list.add(2,"OM");
        System.out.println(list);
        list.set(2,"nitin");
        System.out.println(list);
         System.out.println(list.contains("ashu"));
        System.out.println(list.isEmpty());
        list.remove(2);
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }

        System.out.println();

        for(String st:list){
            System.out.println(st+" ");

//            Iterator it = list.iterator();
//            while(it.hasNext()){
//                System.out.print(it.next);
            }
        }
    }

