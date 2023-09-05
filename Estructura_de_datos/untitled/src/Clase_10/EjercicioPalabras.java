package Clase_10;

import java.util.*;

public class EjercicioPalabras {

    public static void main(String[] args) {

        Map<String, Integer> miMap = new HashMap<>();

        crearMap(miMap);
        mostrarMap(miMap);
    }


    private static void crearMap(Map<String, Integer> miMap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena: ");
        String cadena = sc.nextLine();

        // Divide la entrada en tokens
        String[] tokens = cadena.split(" ");


        for(String token : tokens){
            // convierte la palabra a minuscula
            String palabra = token.toLowerCase();

            // Verifica si el mapa contiene la palabra
            if(miMap.containsKey(palabra)){
                int cuenta = miMap.get(palabra);
                miMap.put(palabra, cuenta+1);
            }else {
                miMap.put(palabra, 1);
            }
        }
    }

    private static void mostrarMap(Map<String, Integer> miMap) {
        Set<String> claves = miMap.keySet();

        // Ordenar las claves
        TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);

        System.out.printf("%nEl mapa contiene: %nclave\t\t\tvalor%n");

        // Generar la salida para cada clave en el mapa
        for(String clave : clavesOrdenadas){
            System.out.printf("%-10s%10s%n",clave, miMap.get(clave));
        }

        System.out.printf("Tamaño: %d%n¿Vacío?: %b%n",miMap.size(), miMap.isEmpty());
    }
}
