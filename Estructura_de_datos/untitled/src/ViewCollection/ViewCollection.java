package ViewCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewCollection {

    public static void main(String[] args) {

        String [] nombres = {"Juan", "Matias", "Pedro"};

        List<String> nombreList = Arrays.asList(nombres);

        nombres[1] = "Pablo";
        System.out.println("Lista despues de la modificación:");
        for(String nombre:nombreList){
            System.out.println(nombre);
        }

        List<String> nombreList2 = new ArrayList<>(Arrays.asList(nombres));
        System.out.println("Nombres de la lista de nombres 2: ");
        for(String nombre:nombreList2){
            System.out.println(nombre);
        }

        System.out.println("Nombres de una sublista: ");
        List<String> sublista = nombreList2.subList(0,1);
        for(String nombre:sublista){
            System.out.println(nombre);
        }

        sublista.add("Maria");

        System.out.println("Nombres de una sublista: ");
        for(String nombre:sublista){
            System.out.println(nombre);
        }

        nombreList2.set(0, "Josue");

        System.out.println("Nombres de una sublista: ");
        for(String nombre:sublista){
            System.out.println(nombre);
        }

        System.out.println("Lista original despues de todo: ");
        for(String nombre:nombreList2){
            System.out.println(nombre);
        }
    }
}
