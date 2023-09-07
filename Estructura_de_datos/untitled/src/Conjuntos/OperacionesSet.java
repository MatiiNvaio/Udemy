package Conjuntos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperacionesSet {

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Arrays.asList(1,3,2,4,8,9,0));
        Set<Integer> b = new HashSet<>(Arrays.asList(1,3,7,5,4,6,7,5));

        // Unión de conjuntos
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Unión de dos conjuntos: ");
        System.out.println(union);

        // Intersección de conjuntos
        Set<Integer> interseccion = new HashSet<>(a );
        interseccion.retainAll(b);
        System.out.println("Intersección de conjuntos: ");
        System.out.println(interseccion);

        // Diferencia de conjuntos
        Set<Integer> diferencia = new HashSet<>(a);
        diferencia.removeAll(b);
        System.out.println("Diferencia de conjuntos: ");
        System.out.println(diferencia);
    }
}
