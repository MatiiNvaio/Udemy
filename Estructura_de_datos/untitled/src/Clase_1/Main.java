package Clase_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        //Creacion de un arraylist
        List<String> listaColores = new ArrayList<>();

        //Creaccion mediante la clase Arrays
        String[] nombres = {"Matias", "Juan", "Eseba"};

        List<String> listaNombres = Arrays.asList(nombres);

        //Agregar elementos de manera individual
        listaColores.add("Rojo");
        listaColores.add("Azul");
        listaColores.add("Amarillo");

        //Construir lista a partir de otra lista
        List<String> elementos = new ArrayList<>(listaColores);

        //Adicion de elementos de otra coleccion
        elementos.addAll(listaNombres);

        System.out.println("Lista de nombres: ");
        listaNombres.forEach(System.out::println);
        System.out.println("Lista de colores: ");
        listaColores.forEach(System.out::println);
        System.out.println("Lista elementos: ");
        elementos.forEach(System.out::println);

        //Iteración a través del ArrayList
        ListIterator<String> iterador = listaColores.listIterator(0);

        System.out.println("Iterador de colores");
        while (iterador.hasNext()){
            System.out.println("Color: "+iterador.next());
        }

        System.out.println("Iterador de colores inverso");
        while (iterador.hasPrevious()){
            System.out.println("Color: "+iterador.previous());
        }

        while (iterador.hasNext()){
            if(iterador.next().equalsIgnoreCase("Amarillo")){
                iterador.remove();
            }
        }

        System.out.println("Iterador de colores sin amarillo");
        for(ListIterator<String> iter = listaColores.listIterator(); iter.hasNext(); ){
            System.out.println("Colores: "+iter.next());
        }


    }
}