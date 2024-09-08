package Service;

import Models.Alumno;
import Models.Asistencia;
import Models.Materia;

import java.time.LocalDate;

public class ProfesorService {
    private static final java.util.List<Asistencia> listaAsistencias = new java.util.ArrayList<>();
    private static final java.util.List<Alumno> listaAlumnos = new java.util.ArrayList<>();
    private static final java.util.List<Materia> listaMaterias = new java.util.ArrayList<>();


    public static long listarAlumnos(){
        return listaAlumnos.size();
    }

    public static long listarMaterias(){
        return listaMaterias.size();
    }
    public static long listarAsistencias(){
        return listaAsistencias.size();
    }
    public static void registrarAsistencia(Alumno alumno, Materia materia, LocalDate fecha, boolean presente){
        if (alumno != null && materia != null && fecha != null) {
            Asistencia asistencia = new Asistencia(alumno, materia, fecha, presente);
            listaAsistencias.add(asistencia);
        }
    }
}
