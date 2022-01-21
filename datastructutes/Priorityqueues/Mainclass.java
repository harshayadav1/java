package Priorityqueues;

import java.util.PriorityQueue;

public class Mainclass {
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("harsha");
        pq.add("akash");
        pq.add("akshitha");
        pq.add("meghana");
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());



    }
    
}
