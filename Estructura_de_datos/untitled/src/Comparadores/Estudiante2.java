package Comparadores;

import java.util.Objects;

public class Estudiante2 implements Comparable<Estudiante2>{

    private int id;
    private String nombre;
    private Integer edad;

    public Estudiante2(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Estudiante estudiante = (Estudiante) o; // Cast a la clase Equipo

        return Objects.equals(nombre, estudiante.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    @Override
    public int compareTo(Estudiante2 estudiante) {
        return this.edad.compareTo(estudiante.getEdad());
    }

    @Override
    public String toString() {
        return  "Nombre= " + nombre +" ,"+
                "Edad= " + edad;
    }
}
