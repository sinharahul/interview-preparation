package datastructures.examples;

import java.util.PriorityQueue;

public class PlayPQ {
    static void create() {
        PriorityQueue<Integer> pq=new PriorityQueue<>
                ((a,b)->b-a);
        pq.add(34);
        pq.add(12);
        pq.add(100);
        pq.add(0);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
    public static void main(String[] args) {
        create();
    }
}
