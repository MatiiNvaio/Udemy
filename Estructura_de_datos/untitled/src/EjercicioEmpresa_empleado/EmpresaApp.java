package EjercicioEmpresa_empleado;

import java.util.*;

public class EmpresaApp {

    private Map<Empresa, List<Empleado>> empresas;
    private Scanner sc;

    public EmpresaApp(){
        empresas = new HashMap<>();
        sc = new Scanner(System.in);
    }

    public void init(){
        int op = 0;

        do{
            System.out.println("--Menú--");
            System.out.println("1. Dar de alta empresas");
            System.out.println("2. Dar de alta empleado");
            System.out.println("3. Imprimir relación");
            System.out.println("4. Salir");

            System.out.println("Ingrese la opción: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    nuevaEmpresa();
                    break;
                case 2:
                    nuevoEmpleado();
                    break;
                case 3:
                    imprimirRelacion();
                    break;
            }
        }while (op != 4);
    }


    private void nuevaEmpresa(){
        System.out.println("Ingrese el Id de la Empresa: ");
        int id = sc.nextInt();
        System.out.println("Ingrese el nombre de la empresa: ");
        String nombre = sc.next();
        System.out.println("Ingrese el sector de la empresa: ");
        String sector = sc.next();

        Empresa empresa = new Empresa(id, nombre, sector);
        if (empresas.containsKey(empresa)){
            System.out.println("\nEsta empresa ya está registrada");
        }else{
            empresas.put(empresa, new LinkedList<Empleado>());
        }
    }

    private void nuevoEmpleado(){
        System.out.println("Ingrese el Id del empleado: ");
        int id = sc.nextInt();
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = sc.next();
        System.out.println("Ingrese el NSS del empleado: ");
        String nss = sc.next();
        System.out.println("Ingrese el nombre de la empresa: ");
        String nombreEmpresa = sc.next();

        Empleado empleado = new Empleado(id, nombre, nss, nombreEmpresa);
        Empresa empresa = new Empresa(nombreEmpresa);

        if(empresas.containsKey(empresa)){
            empresas.get(empresa).add(empleado);
        }else{
            empresas.put(empresa, new LinkedList<Empleado>());
            empresas.get(empresa).add(empleado);
        }
    }


    private void imprimirRelacion() {
        System.out.println("\n");

        for (Map.Entry<Empresa, List<Empleado>> entry : empresas.entrySet()){
            Empresa empresa = entry.getKey();
            List<Empleado> empleados = entry.getValue();

            System.out.println("Empresa: "+empresa.getNombre());
            for(Empleado empleado : empleados){
                System.out.println("\t"+empleado);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        EmpresaApp ea = new EmpresaApp();
        ea.init();
    }

}
