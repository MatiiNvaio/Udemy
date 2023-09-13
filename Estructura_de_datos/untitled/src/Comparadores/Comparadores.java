package Comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparadores {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Maria");
        nombres.add("Matias");
        nombres.add("Juan");
        nombres.add("Santiago");
        nombres.add("Franco");
        nombres.add("Carla");
        nombres.add("Jorge");

        System.out.println(nombres);

        Collections.sort(nombres);

        System.out.println("\nNombres después de la ordenación: ");
        System.out.println(nombres);

        System.out.println("\nOrdenamiento inverso de nombres: ");
        Collections.sort(nombres, Collections.reverseOrder());
        System.out.println(nombres);


        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(3);
        numeros.add(1);
        numeros.add(8);
        numeros.add(6);
        numeros.add(9);
        numeros.add(7);

        System.out.println("\n");
        System.out.println(numeros);

        Collections.sort(numeros);

        System.out.println("\nNumeros después de la ordenación: ");
        System.out.println(numeros);

        System.out.println("\nOrdenamiento inverso de numeros: ");
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println(numeros);

        // Comparacion de edad clase Estudiante

        List<Estudiante> estudiante1 = new ArrayList<>();
        estudiante1.add(new Estudiante(1, "Matias", 20));
        estudiante1.add(new Estudiante(2, "Juan", 40));
        estudiante1.add(new Estudiante(3, "Jose", 23));
        estudiante1.add(new Estudiante(4, "Maria", 13));
        estudiante1.add(new Estudiante(5, "Corla", 31));

        Collections.sort(estudiante1, Collections.reverseOrder());

        System.out.println("\n");
        estudiante1.forEach(System.out::println);


        // Compracion edad clase Estudiante2

        List<Estudiante> estudiante2 = new ArrayList<>();
        estudiante2.add(new Estudiante(1, "Matias", 20));
        estudiante2.add(new Estudiante(2, "Juan", 40));
        estudiante2.add(new Estudiante(3, "Jose", 23));
        estudiante2.add(new Estudiante(4, "Maria", 13));
        estudiante2.add(new Estudiante(5, "Corla", 31));

        Collections.sort(estudiante2, Collections.reverseOrder());

        System.out.println("\n");
        estudiante2.forEach(System.out::println);


        // Comparación edad est1 y est2 con Interface Comparator

        List<Estudiante> estudiante3 = new ArrayList<>();
        estudiante3.add(new Estudiante(1, "Matias", 20));
        estudiante3.add(new Estudiante(2, "Juan", 40));
        estudiante3.add(new Estudiante(3, "Jose", 23));
        estudiante3.add(new Estudiante(4, "Maria", 13));
        estudiante3.add(new Estudiante(5, "Corla", 31));

        Collections.sort(estudiante3, new ComparadorEdad());

        System.out.println("Comparacion de edades usando Comparator: ");
        System.out.println("\n");
        estudiante3.forEach(System.out::println);

        // Comparación de nombres de los estudiantes

        List<Estudiante> estudiante4 = new ArrayList<>();
        estudiante4.add(new Estudiante(1, "Matias", 20));
        estudiante4.add(new Estudiante(2, "Juan", 40));
        estudiante4.add(new Estudiante(3, "Jose", 23));
        estudiante4.add(new Estudiante(4, "Maria", 13));
        estudiante4.add(new Estudiante(5, "Corla", 31));

        Collections.sort(estudiante4, new ComparadorNombre());

        System.out.println("Comparación de nombre usando Comparator: ");
        System.out.println("\n");
        estudiante4.forEach(System.out::println);
    }
}
