package com.gla.collection;
import java.util.*;
public class QueueeExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(67);  // it may be throw exception so we use offer
        q.offer(23);
        q.offer(78);
        q.offer(90);

        System.out.println(q.peek());
        System.out.println(q.element());

        //   q.remove();

        System.out.println(q.remove());

    }
}
