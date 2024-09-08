package Service;

import Models.*;

import java.util.ArrayList;
import java.util.List;


public class AlumnoService {

    private List<Alumno> alumnos = new ArrayList<>();
    private List<Asistencia> asistencias = new ArrayList<>();
    private List<Carrera> carreras = new ArrayList<>();
    private List<Materia> materias = new ArrayList<>();
    private SituacionMateria situacion;


    // Ver asistencias del alumno
    public List<Asistencia> verAsistencias(Long NroLegajo) {
        List<Asistencia> asistenciasDelAlumno = new ArrayList<>();
        for (Asistencia asistencia : asistencias) {
            if (asistencia.getNroLegajo().equals(NroLegajo)) {
                asistenciasDelAlumno.add(asistencia);
            }
        }
        return asistenciasDelAlumno;
    }

    // Ver la situación final del alumno
    public SituacionMateria verSituacionFinal(Long NroLegajo) {
        return "SituacionMateria{" +
                "alumno=" + alumnos.getFirst().getNombre() + " " + alumnos.getLast().getApellido() +
                ", materia=" + materias.getFirst().getNombre() +
                ", situacion='" + situacion + '\'' +
                '}';
    }


    // Obtener datos de la carrera
    public Carrera verDatosCarrera(Long NroLegajo) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNroLegajo().equals(NroLegajo)) {
                for (Carrera carrera : carreras) {
                    if (carrera.getId().equals(alumno.getNroLegajo())) {
                        return new Carrera(carrera.getId(), carrera.getDuracion(),carrera.getNombre(), carrera.getCoordinador(), carrera.getMaterias(), carrera.getPrecioCuota(), carrera.getPrecioInscripcion());
                    }
                }
            }
        }
        throw new RuntimeException("Datos de carrera no encontrados.");
    }


    // Ver materias inscriptas
    public List<Materia> verMateriasInscriptas(Long NroLegajo) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNroLegajo().equals(NroLegajo)) {
                return alumno.getMateriasInscriptas();
            }
        }
        throw new RuntimeException("Alumno no encontrado."); // Simplificación
    }


}





