package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profesor {
    private String nombre;
    private Map<Materia, Map<Alumno, SituacionMateria>> situacionesMateria; // Para almacenar situaciones por materia y alumno
    private List<Materia> materias;
    // Constructor
    public Profesor(String nombre) {
        this.nombre = nombre;
        this.situacionesMateria = new HashMap<>();
        this.materias = new ArrayList<>();  // Inicializamos la lista de materias
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia materia) {
        this.materias.add(materia); // Añadimos una materia a la lista
    }

    public List<Materia> getMaterias() {
        return materias; // Devolvemos la lista de materias
    }


    // Método para registrar la situación final de un alumno en una materia
    public void registrarSituacionFinal(Alumno alumno, Materia materia, String situacion) {
        if (!situacionesMateria.containsKey(materia)) {
            situacionesMateria.put(materia, new HashMap<>());
        }
        SituacionMateria situacionMateria = new SituacionMateria(alumno, materia, situacion);
        situacionesMateria.get(materia).put(alumno, situacionMateria);
    }

    // Método para obtener la situación final de un alumno en una materia
    public SituacionMateria obtenerSituacionFinal(Alumno alumno, Materia materia) {
        if (situacionesMateria.containsKey(materia)) {
            return situacionesMateria.get(materia).get(alumno);
        }
        return null; // O manejar el caso donde no se encuentra la situación//
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", materias='" + materias + '\'' +
                '}';
    }
}

