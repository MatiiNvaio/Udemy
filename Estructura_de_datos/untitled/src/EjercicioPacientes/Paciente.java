package EjercicioPacientes;

public class Paciente implements Comparable<Paciente>{

    private String nombre;
    private Gravedad gravedad;
    private int presion;
    private Double temperatura;

    public Paciente(String nombre, Gravedad gravedad, int presion, Double temperatura){
        this.nombre = nombre;
        this.gravedad = gravedad;
        this.presion = presion;
        this.temperatura = temperatura;
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

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public int compareTo(Paciente paciente) {
        int currentLevel = this.gravedad.getNivel();
        int compareLevel = paciente.gravedad.getNivel();

        return compareLevel - currentLevel;
    }
}
