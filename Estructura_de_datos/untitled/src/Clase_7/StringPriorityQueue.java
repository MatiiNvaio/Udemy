package Clase_7;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class StringPriorityQueue {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        // Añadimos elementos a nuestra cola
        queue.add("Java");
        queue.add("C++");
        queue.add("Python");
        queue.add("C");

        // Mostramos(sin eliminar) el elemento de mayor prioridad
        System.out.println("El elemento de mayor prioridad es: "+queue.peek());

        // Eliminamos el elemento top de la cola de prioridad
        queue.poll();
        System.out.println("Despúes de eliminar el elemento de mas prioridad: "+queue);

        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
