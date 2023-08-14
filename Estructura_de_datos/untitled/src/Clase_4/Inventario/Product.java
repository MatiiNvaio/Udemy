package Clase_4.Inventario;

import java.util.Objects;

public class Product {

    private int id;
    private String nombre;
    private int existencia;
    private Double precio;

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String nombre, int existencia, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
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

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        return id == other.id;
    }

    @Override
    public String toString() {
        return  "Id: " + id +
                "\nNombre: " + nombre +
                "\nExistencia: " + existencia +
                "\nPrecio: " + precio;
    }
}
