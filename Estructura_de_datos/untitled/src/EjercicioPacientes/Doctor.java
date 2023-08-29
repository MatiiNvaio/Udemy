package EjercicioPacientes;

public class Doctor {

    private String nombre;
    private String estado;
    private String especialidad;
    private int numAleatorio;

    public Doctor(){

    }

    public Doctor(String nombre, String estado, String especialidad) {
        this.nombre = nombre;
        this.estado = estado;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setNumAleatorio(int numAleatorio) {
        this.numAleatorio = numAleatorio;
    }
}
