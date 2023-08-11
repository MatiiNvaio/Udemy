package Clase_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class EliminarProductos {

    private static List<Producto> productos;

    public static Producto[] obtenerProductos(){
        Producto[] productos={
                new Producto("Nike", "Negro", "AirForce", "XL"),
                new Producto("Adidas", "Negro", "Yezze", "XL"),
                new Producto("Puma", "Negro", "PSx", "XL"),
                new Producto("Rebook", "Negro", "X1", "XL"),
                new Producto("Nike", "Negro", "AirForce", "XL"),
                new Producto("Adidas", "Negro", "Yezze", "XL"),
        };
        return productos;
    }


    public static void main(String[] args) {

        String [] marcas={"Nike", "Puma"};

        List<Producto> productos = new ArrayList<>(Arrays.asList(obtenerProductos()));
        productos.forEach(System.out::println);

        eliminarMarcasIterador(productos, Arrays.asList(marcas));
        System.out.println("\nLista de productos sin marcas no deseadas");
        productos.forEach(System.out::println);

        //System.out.println("\nLista de productos con expresion lamda");
        //eliminarMarcasStream(productos, Arrays.asList(marcas));
        //productos.forEach(System.out::println);
    }

    public static void eliminarMarcasStream(List<Producto> productos, List<String> marcas){
        productos.removeIf((producto) -> marcas.contains(producto.getMarca()));
    }

    public static void eliminarMarcasIterador(List<Producto> productos, List<String> marcas){
        for(ListIterator<Producto> iterador = productos.listIterator(); iterador.hasNext(); ){
            if(marcas.contains(iterador.next().getMarca())){
                iterador.remove();
            }
        }
    }
}
