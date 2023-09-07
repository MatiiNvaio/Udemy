package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Añado elementos {0,1,2,3,4]
        for(int i = 0; i < 5; i++){
            queue.add(i);
            // queue.offer(i); Esta también es una opción valida
        }

        // Muestro los elementos insertados
        System.out.println("Contenido de la cola: "+queue);

        // Eliminar el head de la cola
        int head = queue.poll();
        // int head = queue.remove() tambien es valido
        System.out.println("El head de la cola es: "+head);
        System.out.println("Elementos de la cola luego de eliminar el head: "+ queue);

        int size = queue.size();
        System.out.println("El tamaño de la cola es: "+size);

        // Podemos ver cual es el head sin eliminarlo
        System.out.println("El head de la cola es: "+queue.peek());
    }
}
