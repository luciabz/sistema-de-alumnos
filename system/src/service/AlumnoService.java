package Service;

import Models.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlumnoService {

    private List<Alumno> alumnos = new ArrayList<>();
    private List<Asistencia> asistencias = new ArrayList<>();
    private List<Carrera> carreras = new ArrayList<>();
    private List<Materia> materias = new ArrayList<>();

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

    // Ver la situación final del alumno (simplificado)
    public SituacionMateria verSituacionFinal(Long NroLegajo) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNroLegajo().equals(NroLegajo)) {
                return calcularSituacionFinal(alumno);
            }
        }
        throw new RuntimeException("Alumno no encontrado."); // Simplificación
    }

    // Obtener datos de la carrera
    public DatosCarrera verDatosCarrera(Long NroLegajo) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNroLegajo().equals(NroLegajo)) {
                for (Carrera carrera : carreras) {
                    if (carrera.getNroLegajo().equals(alumno.getCarreraId())) {
                        return new DatosCarrera(carrera.getNombre(), carrera.getCoordinador(), carrera.getCuatrimestres());
                    }
                }
            }
        }
        throw new RuntimeException("Datos de carrera no encontrados."); // Simplificación
    }

    // Inscribirse a materias
    public void inscribirMateria(Long alumnoId, Long materiaId) {
        Optional<Alumno> alumnoOpt = alumnos.stream().filter(alumno -> alumno.getNroLegajo().equals(alumnoId)).findFirst();
        Optional<Materia> materiaOpt = materias.stream().filter(materia -> materia.getCodigo().equals(materiaId)).findFirst();

        if (alumnoOpt.isPresent() && materiaOpt.isPresent()) {
            Alumno alumno = alumnoOpt.get();
            Materia materia = materiaOpt.get();
            if (!alumno.getMaterias().contains(materia)) {
                alumno.getMaterias().add(materia);
            }
        } else {
            throw new RuntimeException("Alumno o Materia no encontrado.");
        }
    }

    // Ver materias inscriptas
    public List<Materia> verMateriasInscriptas(Long alumnoId) {
        for (Alumno alumno : alumnos) {
            if (alumno.getNroLegajo().equals(alumnoId)) {
                return alumno.getMaterias();
            }
        }
        throw new RuntimeException("Alumno no encontrado."); // Simplificación
    }

    // Dar de baja una materia
    public void darDeBajaMateria(Long alumnoId, Long materiaId) {
        Optional<Alumno> alumnoOpt = alumnos.stream().filter(alumno -> alumno.getNroLegajo().equals(alumnoId)).findFirst();

        if (alumnoOpt.isPresent()) {
            Alumno alumno = alumnoOpt.get();
            alumno.getMaterias().removeIf(materia -> materia.getId().equals(materiaId));
        } else {
            throw new RuntimeException("Alumno no encontrado.");
        }
    }




}





