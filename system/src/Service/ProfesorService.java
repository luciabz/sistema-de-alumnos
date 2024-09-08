package Service;

import Models.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfesorService {
    private Profesor profesor;
    private Map<Materia, Map<Alumno, SituacionMateria>> situacionesMateria;
    private List<Asistencia> asistencias;

    // Constructor
    public ProfesorService(Profesor profesor) {
        this.profesor = profesor;
        this.situacionesMateria = new HashMap<>();
        this.asistencias = new ArrayList<>();
    }


    public void registrarSituacionFinal(Alumno alumno, Materia materia, String situacion) {
        if (!situacionesMateria.containsKey(materia)) {
            situacionesMateria.put(materia, new HashMap<>());
        }
        SituacionMateria situacionMateria = new SituacionMateria(alumno, materia, situacion);
        situacionesMateria.get(materia).put(alumno, situacionMateria);
    }


    public SituacionMateria obtenerSituacionFinal(Alumno alumno, Materia materia) {
        if (situacionesMateria.containsKey(materia)) {
            return situacionesMateria.get(materia).get(alumno);
        }
        return null;
    }

    // Registrar asistencia de un alumno
    public void registrarAsistencia(Alumno alumno, Materia materia, LocalDate fecha, boolean presente) {
        Asistencia asistencia = new Asistencia(alumno.getNroLegajo(), alumno, materia, fecha, presente);
        asistencias.add(asistencia);
    }


    // Obtener asistencias por alumno
    public List<Asistencia> obtenerAsistenciasPorAlumno(Alumno alumno) {
        List<Asistencia> asistenciasAlumno = new ArrayList<>();
        for (Asistencia asistencia : asistencias) {
            if (asistencia.getAlumno().equals(alumno)) {
                asistenciasAlumno.add(asistencia);
            }
        }
        return asistenciasAlumno;
    }

    // Contar inasistencias de un alumno en una materia
    public long contarInasistenciasPorAlumno(Alumno alumno, Materia materia) {
        return asistencias.stream()
                .filter(asistencia -> asistencia.getAlumno().equals(alumno) &&
                        asistencia.getMateria().equals(materia) &&
                        !asistencia.isPresente())
                .count();
    }

    // Contar asistencias de un alumno en una materia
    public long contarAsistenciasPorAlumno(Alumno alumno, Materia materia) {
        return asistencias.stream()
                .filter(asistencia -> asistencia.getAlumno().equals(alumno) &&
                        asistencia.getMateria().equals(materia) &&
                        asistencia.isPresente())
                .count();
    }

    // Obtener todas las asistencias de una materia
    public List<Asistencia> obtenerAsistenciasPorMateria(Materia materia) {
        List<Asistencia> asistenciasMateria = new ArrayList<>();
        for (Asistencia asistencia : asistencias) {
            if (asistencia.getMateria().equals(materia)) {
                asistenciasMateria.add(asistencia);
            }
        }
        return asistenciasMateria;
    }


}
