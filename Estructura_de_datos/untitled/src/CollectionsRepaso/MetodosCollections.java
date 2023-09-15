package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MetodosCollections {

    public static void main(String[] args) {

        String[] colores = {"rojo", "blanco", "amrillo", "azul"};

        List<String> lista1 = Arrays.asList(colores);
        List<String> lista2 = new ArrayList<>();

        lista2.add("negro");
        lista2.add("rojo");
        lista2.add("verde");

        System.out.println("Antes de addAll, lista 2 contine: ");
        for (String color: lista2){
            System.out.println(" "+color);
        }

        Collections.addAll(lista2, colores); // agrega los objetos String de colores a la lista 2

        System.out.println("\nDespues de addAll, lista 2 contiene: ");
        for (String color: lista2){
            System.out.println(" "+color);
        }

        // Obtiene la frecuencia de rojo
        int frecuencia = Collections.frequency(lista2, "rojo");
        System.out.println("\nFrecuencia del color rojo en la lista2: "+frecuencia);

        // Comprueba si lista1 y lista2 tienen elementos en común
        boolean compartidos = Collections.disjoint(lista1, lista2);
        if (compartidos){
            System.out.println("\nNo comparten elementos lista1 y lista2");
        }else{
            System.out.println("\nLista1 y lista2 compraten elementos");
        }
    }
}
