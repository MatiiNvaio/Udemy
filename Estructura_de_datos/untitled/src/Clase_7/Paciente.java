package Clase_7;

public class Paciente implements Comparable<Paciente>{

    private String nombre;
    private Gravedad gravedad;

    public Paciente(String nombre, Gravedad gravedad){
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Gravedad getGravedad() {
        return gravedad;
    }

    public void setGravedad(Gravedad gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int compareTo(Paciente paciente) {
        int currentLevel = this.gravedad.getNivel();
        int compareLevel = paciente.gravedad.getNivel();

        return compareLevel - currentLevel;
    }
}
