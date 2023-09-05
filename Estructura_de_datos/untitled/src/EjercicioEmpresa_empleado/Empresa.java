package EjercicioEmpresa_empleado;

import java.util.Objects;

public class Empresa {

    private int id;
    private String nombre;
    private String sector;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(int id, String nombre, String sector) {
        this.id = id;
        this.nombre = nombre;
        this.sector = sector;
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

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa)) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombre, empresa.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Empresa" +
                "Id: " + id +
                "Nombre:" + nombre +
                "Sector: " + sector;
    }
}
