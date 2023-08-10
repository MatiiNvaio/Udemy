public class Producto {

    private String marca;
    private String color;
    private String modelo;
    private String talla;

    public Producto(String marca, String color, String modelo, String talla) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Producto" +
                "marca: " + marca +
                "color: " + color +
                "modelo: " + modelo +
                "talla: " + talla;
    }
}
