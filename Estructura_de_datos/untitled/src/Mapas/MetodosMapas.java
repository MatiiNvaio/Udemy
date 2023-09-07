package Mapas;

import java.util.HashMap;
import java.util.Map;

public class MetodosMapas {

    public static void main(String[] args) {

        Map<String, String> jugadores = new HashMap<>();

        //Insercion de elementos dentro de un mapa
        jugadores.put("Leo Messi", "Inter Miami");
        jugadores.put("Kylian Mbappe", "PSG");
        jugadores.put("Kevin De Bruyne", "Manchester City");
        jugadores.put("Luka Modric", "Real Madrid");
        jugadores.put("Vinicius Jr", "Real Madrid");
        jugadores.put("Lautaro Martinez", "Inter");
        jugadores.put("Enzo Fernandez", null);

        // Manera en la que mediante el contructor llenamos otro mapa con el que ya creamos
        Map<String, String> jugadores2 = new HashMap<>(jugadores);

        // Otra manera de insertar datos dentro de mapas
        Map<String, String> jugadores3 = new HashMap<>();
        jugadores3.putAll(jugadores);

        // Añadir un valor, si hay otro ausente
        jugadores.putIfAbsent("Enzo Fernandez", "Chelsea");
        System.out.println("El equipo de Enzo Fernandez es: " + jugadores.get("Enzo Fernandez"));

        // Otener los valores de un mapa
        String equipoLeo = jugadores.get("Leo Messi");
        System.out.println("El equipo de Leo es: " + equipoLeo);

        // Devolver un valor por defecto en caso de que un dato no se encuentre
        String equipoCrintiano = jugadores.getOrDefault("Cristiano Ronaldo", "No está registrado");
        System.out.println("El equipo de Cristiano es: " + equipoCrintiano);

        // Preguntar si una clave está en el mapa
        if (jugadores.containsKey("Luka Modric")) {
            System.out.println("El equipo de Luka es: " + jugadores.get("Luka Modric"));
        } else {
            System.out.println("Luka Modric no se encuentra");
        }

        // Preguntar si se encuentra un valor en le mapa
        System.out.println("Se encuentra el valor Sevilla? " + jugadores.containsValue("Sevilla"));

        // Se pueden obtener todas las llaves del mapa
        System.out.println("Que jugadores están registrados? ");
        System.out.println(jugadores.keySet());

        // Se pueden obtener todos los valores del mapa
        System.out.println("Que equipos están registrados?");
        System.out.println(jugadores.values());

        // Reemplzar uno de los valores del mapa
        jugadores.replace("Kylian Mbappe", "Real Madrid");
        System.out.println("Ahora Mbappe juega en: " + jugadores.get("Kylian Mbappe"));

        // Eliminar una entrada del mapa
        System.out.println("Se encuentra Vinicius Jr? " + jugadores.containsKey("Vinicius Jr"));
        jugadores.remove("Vinicius Jr");
        System.out.println("Se encuentra Vinicius Jr? " + jugadores.containsKey("Vinicius Jr"));

        // Conocer el tamaño del mapa
        System.out.println("El tamaño del mapa es: " + jugadores.size());

        // Podemos preguntar si el mapa está vacío
        if (jugadores.isEmpty()) {
            System.out.println("El mapa está vacío");
        } else {
            System.out.println("El mapa contiene elementos");
        }

        // Limpiar todo el mapa
        jugadores.clear();
        System.out.println("La cantidad de jugadores en el mapa despues de limpierlo es: "+jugadores.size());
    }
}

