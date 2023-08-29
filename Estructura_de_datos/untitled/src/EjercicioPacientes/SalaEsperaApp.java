package EjercicioPacientes;

import java.util.Scanner;

public class SalaEsperaApp {

    Scanner sc = new Scanner(System.in);
    SalaEspera sala = new SalaEspera();

    public static void main(String[] args) {

        SalaEsperaApp salaEsperaApp = new SalaEsperaApp();
        salaEsperaApp.menu();

    }


    public void menu(){

        SalaEsperaApp salaEsperaApp = new SalaEsperaApp();
        int op = 0;
        do{
            System.out.println("- Sala de emergencias -");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Consultar estado de doctores");
            System.out.println("3. Asignar doctores");
            System.out.println("4. Desocupar doctor");
            System.out.println("5. Devolver informe del dia");
            System.out.println("6. Salir");
            op = sc.nextInt();
            switch (op){
                case 1:
                    salaEsperaApp.registrarPaciente();
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    salaEsperaApp.doctoresDesocupados();
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    System.out.println("-----------------------");
                    salaEsperaApp.ocuparDoctor();
                    System.out.println("-----------------------");
                    break;
                case 4:
                    System.out.println("-----------------------");
                    salaEsperaApp.desocuparDoctor();
                    System.out.println("-----------------------");
                    break;
                case 5:
                    System.out.println("-------------------------------");
                    salaEsperaApp.informe();
                    System.out.println("-------------------------------");
                    break;
                case 6:
                    System.out.println("Salio con exito");
                    break;
                default:
                    System.out.println("Opcion no disponible, intente otra vez: ");
                    op = sc.nextInt();
                    break;
            }
        }while(op != 5);
    }


    public void registrarPaciente(){
        System.out.println("-----------------------");
        System.out.println("Nombre del paciente: ");
        String nombre = sc.next();

        System.out.println("Presión arterial: ");
        Integer presion = sc.nextInt();

        System.out.println("Temperatura: ");
        Double temp = sc.nextDouble();

        int op = 0;
        System.out.println("Gravedad del paciente");
        System.out.println("1. MENOR");
        System.out.println("2. MODERADO");
        System.out.println("3. SEVERO");
        System.out.println("4. MUY SEVERO");
        op = sc.nextInt();
        switch (op){
            case 1:
                sala.nuevoPaciente(nombre, presion, temp, Gravedad.MENOR);
                break;
            case 2:
                sala.nuevoPaciente(nombre, presion, temp, Gravedad.MODERADO);
                break;
            case 3:
                sala.nuevoPaciente(nombre, presion, temp, Gravedad.SEVERO);
                break;
            case 4:
                sala.nuevoPaciente(nombre, presion, temp, Gravedad.MUY_SEVERO);
                break;
        }
    };

    private void doctoresDesocupados() {
        sala.doctorDesocupado();
    }

    private void ocuparDoctor(){
        System.out.println("Nombre del doctor que quiere asignar: ");
        String nombreOcupado = sc.next();
        sala.ocuparDoctor(nombreOcupado);
    }

    private void desocuparDoctor(){
        sala.listaDoctoresOcupados();
        System.out.println("-------------------------");
        System.out.println("Doctor/a que se desocupó: ");
        String nombreDesocupado = sc.next();
        sala.desocuparDoctor(nombreDesocupado);
    }

    private void informe(){
        sala.devolverInforme();
    }
}
