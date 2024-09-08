package Service;

import Models.Alumno;
import Models.Materia;
import Models.Profesor;
import Models.SituacionMateria;

import java.util.HashMap;
import java.util.Map;

public class ProfesorService {
    private Profesor profesor;
    private Map<Materia, Map<Alumno, SituacionMateria>> situacionesMateria;

    // Constructor
    public ProfesorService(Profesor profesor) {
        this.profesor = profesor;
        this.situacionesMateria = new HashMap<>();
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


}
