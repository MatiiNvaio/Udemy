package EjercicioPacientes;

import java.util.*;

public class SalaEspera {

    private List<Paciente> pacientes = new LinkedList<>();
    private LinkedList<Doctor> doctores = new LinkedList<>(listaDoctores());

    public void nuevoPaciente(String nombre, Integer presion, Double temp, Gravedad gravedad) {

        Paciente newPaciente = new Paciente(nombre, gravedad, presion, temp);

        boolean correcto = pacientes.add(newPaciente);

        if(correcto){
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("El paciente "+nombre+" esta en lista de espera con gravedad "+gravedad.getDescripcion());
            System.out.println("-----------------------------------------------------------------------");
        }else{
            System.out.println("No fue posible ingresar al paciente");
        }
    }

    public List<Doctor> listaDoctores(){

        return Arrays.asList(
                new Doctor("Mario", "Desocupado", "Traumatologo"),
                new Doctor("Rogelio", "Desocupado", "Cirujano General"),
                new Doctor("Karina", "Desocupado", "Pediatra"),
                new Doctor("Francisco", "Desocupado", "Taumatologo"),
                new Doctor("Adriana", "Desocupado", "Residente")
        );
    }


    public void doctorDesocupado() {
        int size = doctores.size();
        String nombre;

        for (int i = 0; i < size; i++) {
            Doctor doctorDesocupado = doctores.get(i);

            if (doctorDesocupado.getEstado().equals("Desocupado")) {
                nombre = doctorDesocupado.getNombre();
                System.out.println("Doctores/as desocupados: "+nombre);
            } else {
                nombre = doctorDesocupado.getNombre();
                System.out.println("Doctores/as ocupados: "+nombre);
            }
        }
    }

    public void ocuparDoctor(String nombreOcupado) {
        int size = doctores.size();
        Integer encontrado = 0;
        Doctor doctorDesocupado = new Doctor();

        for(int i = 0; i < size; i++){
            doctorDesocupado = doctores.get(i);

            if(nombreOcupado.equalsIgnoreCase(doctorDesocupado.getNombre()) && doctorDesocupado.getEstado().equalsIgnoreCase("Desocupado")){
                encontrado = 1;
                break;
            } else if (nombreOcupado.equalsIgnoreCase(doctorDesocupado.getNombre()) && doctorDesocupado.getEstado().equalsIgnoreCase("Ocupado")) {
                encontrado = 2;
                break;
            }

            boolean noEncontrado = doctores.contains(nombreOcupado);
            if(!noEncontrado){
                encontrado = 3;
            }
        }

        if(encontrado == 1){
            doctorDesocupado.setEstado("Ocupado");
            System.out.println("El doctor/a "+nombreOcupado+" atenderá al paciente");
        } else if (encontrado == 2) {
            System.out.println("El doctor/a "+nombreOcupado+" se encuentra ocupado");
        }else if(encontrado == 3){
            System.out.println("El doctor/a no se encuentra en la sala");
        }
    }

    public void listaDoctoresOcupados(){
        ListIterator<Doctor> iterador = doctores.listIterator(0);
        Scanner sc = new Scanner(System.in);

        while (iterador.hasNext()){
            Doctor iteradorDoc = iterador.next();
            boolean comprobarOcupacion = iteradorDoc.getEstado().equalsIgnoreCase("Ocupado");

            if(comprobarOcupacion){
                System.out.println("Doctores/as ocupados: "+iteradorDoc.getNombre());
            }
        }
    }

    public void desocuparDoctor(String nombreDesocupado) {
        int size = doctores.size();
        Integer encontrado = 0;
        Doctor doctorOcupado = new Doctor();

        for(int i = 0; i < size; i++){
            doctorOcupado = doctores.get(i);

            if(nombreDesocupado.equalsIgnoreCase(doctorOcupado.getNombre()) && doctorOcupado.getEstado().equalsIgnoreCase("Ocupado")){
                encontrado = 1;
                break;
            }
            boolean noEncontrado = doctores.contains(nombreDesocupado);
            if(!noEncontrado){
                encontrado = 2;
            }
        }

        if(encontrado == 1){
            doctorOcupado.setEstado("Desocupado");
            System.out.println("El doctor/a "+nombreDesocupado+" ahora está desocupado");
        } else if(encontrado == 2){
            System.out.println("El doctor/a no se encuentra en la sala");
        }
    }

    public void devolverInforme() {
        Queue<Paciente> prioridadAtencion = new PriorityQueue<>(pacientes);
        int numPacientes = pacientes.size();

        for(int i = 0; i < numPacientes; i++){
            Paciente pacienteAtendido = prioridadAtencion.poll();
            String nombre = pacienteAtendido.getNombre();
            String gravedad = pacienteAtendido.getGravedad().getDescripcion();
            Integer presion = pacienteAtendido.getPresion();
            Double temp = pacienteAtendido.getTemperatura();

            System.out.println("Atendiendo al paciente "+nombre+" con gravedad: "+gravedad+". \n" +
                    "Presión arterial: "+presion+"\n"+
                    "Temperatura: "+temp+"\n"
                    //"Doctor: "+doc.getNombre()
            );

        }
    }
}
