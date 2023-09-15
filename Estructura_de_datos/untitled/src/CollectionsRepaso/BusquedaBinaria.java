package CollectionsRepaso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusquedaBinaria {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(7);
        nums.add(9);
        nums.add(1);
        nums.add(13);
        nums.add(6);

        // Ordenamos la lista
        Collections.sort(nums);
        int indice = Collections.binarySearch(nums, 1);

        // Si no encuantra el valor devuelve -1, si lo encuentra devuelve el indice

        System.out.println("El indice del numero 1 es: "+indice);



    }
}
