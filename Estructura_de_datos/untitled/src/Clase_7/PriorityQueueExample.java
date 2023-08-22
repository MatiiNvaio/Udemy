package Clase_7;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(0);
        queue.add(3);
        queue.add(6);
        queue.add(22);
        queue.add(12);
        queue.add(5);
        queue.add(1);
        queue.add(9);
        queue.add(13);
        queue.add(10);

        System.out.println(queue);

        int head = queue.poll();
        System.out.println("Cabeza de la cola: "+head);

        System.out.println(queue);

    }
}
