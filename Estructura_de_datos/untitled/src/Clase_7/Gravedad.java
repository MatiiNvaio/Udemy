package Clase_7;

public enum Gravedad {

    MENOR("Menor", 1),
    MODERADO("Moderado", 2),
    SEVERO("Severo", 3),
    MUY_SEVERO("Muy severo", 4);

    private String descripcion;
    private Integer nivel;

    private Gravedad(String descripcion, Integer nivel){
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
}
