package Comparadores;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Estudiante> {


    @Override
    public int compare(Estudiante est1, Estudiante est2) {

        return est1.getNombre().compareTo(est2.getNombre());
    }
}
