package EjercicioEmpresa_empleado;

import java.util.Objects;

public class Empleado {

    private int id;
    private String nombre;
    private String nss;
    private String empresa;

    public Empleado(int id, String nombre, String nss, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.nss = nss;
        this.empresa = empresa;
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

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o){return true;}
//        if (!(o instanceof Empleado empleado)){return false;}
//        return getId() == empleado.getId() && Objects.equals(getNombre(), empleado.getNombre()) && Objects.equals(getNss(), empleado.getNss()) && Objects.equals(getEmpresa(), empleado.getEmpresa());
//    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getNss(), getEmpresa());
    }

    @Override
    public String toString() {
        return "-Empleado-" +
                "\nId: " + id +
                "\nNombre: " + nombre +
                "\nNSS: " + nss +
                "\nEmpresa: " + empresa;
    }
}
