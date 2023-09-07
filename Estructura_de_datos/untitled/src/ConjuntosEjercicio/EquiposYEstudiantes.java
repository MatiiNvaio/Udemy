package ConjuntosEjercicio;

import java.util.*;

public class EquiposYEstudiantes {

    private Map<Equipo, Set<Estudiante>> equipos;

    public EquiposYEstudiantes(){
        equipos = new HashMap<>();

        Equipo futbolSala = new Equipo("Fútbol Sala");
        Equipo matematicas = new Equipo("Olimpiadas de matemáticas");

        equipos.put(futbolSala, verEstudiantesPorEquipo(futbolSala.getNombre()));
        equipos.put(matematicas, verEstudiantesPorEquipo(matematicas.getNombre()));
    }

    public Map<Equipo, Set<Estudiante>> getEquipos(){
        return equipos;
    }

    private Set<Estudiante> verEstudiantesPorEquipo(String nombre) {
        Set<Estudiante> estudiantesPorEquipo = new LinkedHashSet<>(getEstudiante());

        for (Iterator<Estudiante> iter = estudiantesPorEquipo.iterator(); iter.hasNext(); ){
            Estudiante estudiante = iter.next();
            if(!estudiante.getEquipos().contains(nombre)){
                iter.remove();
            }
        }

        return estudiantesPorEquipo;
    }

    private Collection<Estudiante> getEstudiante() {

        Collection<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("Pedro", Arrays.asList("Fútbol Sala")));
        estudiantes.add(new Estudiante("Diego", Arrays.asList("Fútbol Sala", "Olimpiadas de matemáticas")));
        estudiantes.add(new Estudiante("Hugo", Arrays.asList("Fútbol Sala")));
        estudiantes.add(new Estudiante("Carlos", Arrays.asList("Fútbol Sala")));
        estudiantes.add(new Estudiante("Roberto", Arrays.asList("Fútbol Sala")));
        estudiantes.add(new Estudiante("Rolando", Arrays.asList("Fútbol Sala", "Olimpiadas de matemáticas")));
        estudiantes.add(new Estudiante("Edgar", Arrays.asList("Fútbol Sala", "Olimpiadas de matemáticas")));
        estudiantes.add(new Estudiante("Andrea", Arrays.asList("Olimpiadas de matemáticas")));
        estudiantes.add(new Estudiante("Cristina", Arrays.asList("Olimpiadas de matemáticas")));
        estudiantes.add(new Estudiante("José", Arrays.asList("Olimpiadas de matemáticas")));

        estudiantes.add(new Estudiante("Germán", Arrays.asList("Softball")));
        estudiantes.add(new Estudiante("Sara", Arrays.asList("Ajedréz, Decathlon")));
        estudiantes.add(new Estudiante("Concepción", Arrays.asList("Softball")));

        return estudiantes;
    }

    public static void main(String[] args) {
        EquiposYEstudiantes eye = new EquiposYEstudiantes();
        Map<Equipo, Set<Estudiante>> equipos = eye.getEquipos();
        Equipo futbolSala = new Equipo("Fútbol Sala");
        Equipo matematicas = new Equipo("Olimpiadas de matemáticas");

        // ¿Quines están en al menos uno de los dos equipos?

        Set<Estudiante> enDosEquipos = new LinkedHashSet<>(equipos.get(futbolSala));
        enDosEquipos.addAll(equipos.get(matematicas));
        System.out.println("Estudiantes en al menos uno de los dos equipos: ");
        System.out.println(enDosEquipos);
        System.out.println("\n");

        // ¿Quienes están en el equipo de futbol sala pero no en el de la olimpiadas de matematica?

        Set<Estudiante> estFutbolSala = new LinkedHashSet<>(equipos.get(futbolSala));
        estFutbolSala.removeAll(equipos.get(matematicas));
        System.out.println("Estudiantes en el equipo de Fútbol Sala: ");
        System.out.println(estFutbolSala);
        System.out.println("\n");


        // ¿Quienes están solo en el equipo de las olimpiadas?

        Set<Estudiante> estOlimpiadas = new LinkedHashSet<>(equipos.get(matematicas));
        estOlimpiadas.removeAll(equipos.get(futbolSala));
        System.out.println("Estudiantes en el equipo de las Olimpiadas de Matamática: ");
        System.out.println(estOlimpiadas);
        System.out.println("\n");


        // ¿Quines están en ambos equipos?

        Set<Estudiante> ambosEquipos = new LinkedHashSet<>(equipos.get(futbolSala));
        ambosEquipos.retainAll(equipos.get(matematicas));
        System.out.println("Estudiantes en ambos equipos: ");
        System.out.println(ambosEquipos);
        System.out.println("\n");

        // ¿Quienes están solo en uno de los dos equipos?

        Set<Estudiante> unEquipoSala = new LinkedHashSet<>(equipos.get(futbolSala));
        unEquipoSala.removeAll(equipos.get(matematicas));
        Set<Estudiante> unEquipoOlim = new LinkedHashSet<>(equipos.get(matematicas));
        unEquipoOlim.removeAll(equipos.get(futbolSala));
        System.out.println("Jugadores que están en un solo equipo: ");
        System.out.println(unEquipoSala+" "+unEquipoOlim);

    }
}

