package com.gla.collection;
import java.util.*;
public class DequeeExample {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(56);
        d.addLast(66);
        d.offerFirst(89);
        d.offerLast(90);

        // 89,56,66,90
        System.out.println(d);
        System.out.println(d.remove());
        System.out.println(d.poll());

        System.out.println(d.peek());
        System.out.println(d.element());

    }
}
