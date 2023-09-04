package Clase_10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IreracionMapas {

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

        // Iteración usando entrySet()
        Set<Map.Entry<String, String >> entries = jugadores.entrySet();
        for(Map.Entry<String , String> entry : entries){
            System.out.println("Jugador: "+entry.getKey()+", Equipo: "+entry.getValue());
        }

        System.out.println("");
        // Otra manera de iterar
        for (Map.Entry<String, String > entry : jugadores.entrySet()){
            System.out.println("Jugador: "+entry.getKey()+", Equipo: "+entry.getValue());
        }

        System.out.println("");
        // Recorrer solo las llaves (jugadores)
        for (String jugadores2 : jugadores.keySet()){
            System.out.println("Jugadores: "+jugadores2);
        }

        System.out.println("");
        // Recorrer solo los valores (equipos)
        for(String equipos : jugadores.values()){
            System.out.println("Equipos: "+equipos);
        }

        System.out.println("");
        // Manera de iterar con un Iterator
        System.out.println("Impresion con iteradores ");
        for(Iterator < Map.Entry<String, String> > iter = jugadores.entrySet().iterator(); iter.hasNext(); ){
            Map.Entry<String, String> entry = iter.next();
            String jugador = entry.getKey();
            String equipo = entry.getValue();
            System.out.println("Jugador: "+jugador+", Equipo: "+equipo);
        }

        System.out.println("");
        System.out.println("Impresion de jugadores y equipos usando el método foreach:");
        // Iterar de manera funcional
        jugadores.forEach((jugador, equipos) -> System.out.println("Jugador: "+jugador+", Equipo: "+equipos));
    }
}
