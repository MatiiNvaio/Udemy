package Clase_7;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class AtencionPaciente {

    public static List<Paciente> listaDePacientes(){
        return Arrays.asList(
                new Paciente("Juan", Gravedad.MENOR),
                new Paciente("Matias", Gravedad.SEVERO),
                new Paciente("Santiago", Gravedad.MODERADO),
                new Paciente("Eseba", Gravedad.MODERADO),
                new Paciente("Franco", Gravedad.SEVERO),
                new Paciente("Valentin", Gravedad.MODERADO),
                new Paciente("Maximo", Gravedad.MODERADO),
                new Paciente("Joaquin", Gravedad.MUY_SEVERO),
                new Paciente("Marcos", Gravedad.SEVERO),
                new Paciente("Walter", Gravedad.MENOR),
                new Paciente("Giuliano", Gravedad.MENOR),
                new Paciente("Martin", Gravedad.SEVERO),
                new Paciente("Maximiliano", Gravedad.MENOR),
                new Paciente("Octavio", Gravedad.MENOR),
                new Paciente("Maria", Gravedad.MENOR),
                new Paciente("Matina", Gravedad.SEVERO),
                new Paciente("Luisina", Gravedad.MUY_SEVERO)
        );
    }

    public static void main(String[] args) {
        Queue<Paciente> prioridadAtencion = new PriorityQueue<>(listaDePacientes());

        int numDePacientes = prioridadAtencion.size();

        for(int i = 0; i < numDePacientes; i++){
            Paciente pacienteAtendido = prioridadAtencion.poll();
            String nombre = pacienteAtendido.getNombre();
            String gravedad = pacienteAtendido.getGravedad().getDescripcion();

            System.out.println("Atendiendo al paciente: "+nombre+" con gravedad: "+gravedad);
        }
    }
}
