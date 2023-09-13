package Comparadores;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Estudiante> {


    @Override
    public int compare(Estudiante est1, Estudiante est2) {
        return est2.compareTo(est1);
    }
}
