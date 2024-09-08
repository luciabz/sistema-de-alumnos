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
    private ProfesorService profesorService;

    public AlumnoService(ProfesorService profesorService) {
        this.profesorService = profesorService; // Inicialización
    }


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
    public SituacionMateria verSituacionFinal(Long NroLegajo, Materia materia) {
        for (Asistencia asistencia : asistencias) {
            if (asistencia.getAlumno().getNroLegajo().equals(NroLegajo) &&
                    asistencia.getMateria().equals(materia)) {
                // Buscar la situación final en función del número de legajo y materia
                SituacionMateria situacion = profesorService.obtenerSituacionFinal(asistencia.getAlumno(), materia);
                return situacion;
            }
        }
        throw new RuntimeException("Situación final no encontrada para el alumno y materia.");
    }


    // Obtener datos de la carrera
    public Carrera verDatosCarrera(Long NroLegajo) {
        int legajo = NroLegajo.intValue(); // Convertir Long a int
        for (Alumno alumno : alumnos) {
            if (alumno.getNroLegajo() == legajo) { // Comparar int con int
                for (Carrera carrera : carreras) {
                    if (carrera.getId() == legajo) { // Comparar int con int
                        return new Carrera(carrera.getId(), carrera.getDuracion(), carrera.getNombre(), carrera.getCoordinador(), carrera.getMaterias(), carrera.getPrecioCuota(), carrera.getPrecioInscripcion());
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





