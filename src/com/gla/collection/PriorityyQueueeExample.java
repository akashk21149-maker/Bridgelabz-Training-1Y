package com.gla.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityyQueueeExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(77);
        pq.offer(56);
        pq.offer(2);
        pq.offer(12);
        pq.offer(89);
        System.out.println(pq);
        System.out.println(pq.element());
        pq.poll();  //  the top element
        System.out.println(pq);
    }
}
