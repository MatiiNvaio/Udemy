package ConjuntosEjercicio;

import EjercicioEmpresa_empleado.Empresa;

import java.util.List;
import java.util.Objects;

public class Estudiante {
    private String nombre;
    private List<String> equipos;

    public Estudiante(String nombre, List<String> equipos) {
        this.nombre = nombre;
        this.equipos = equipos;
    }

    public Estudiante(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<String> equipos) {
        this.equipos = equipos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estudiante estudiante = (Estudiante) o;

        return Objects.equals(nombre, estudiante.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
