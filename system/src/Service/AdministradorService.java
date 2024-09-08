package Service;

import Models.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AdministradorService {
    public static ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    public static ArrayList<Profesor> listaProfesores = new ArrayList<>();
    public static ArrayList<Coordinador> listaCoordinadores = new ArrayList<>();
    public static ArrayList<Carrera> listaCarreras = new ArrayList<>();
    public static ArrayList<Materia> listaMaterias = new ArrayList<>();
    public static ArrayList<Matricula> listaMatriculas = new ArrayList<>();
    public static ArrayList<Asistencia> listaAsistencias = new ArrayList<>();



    public static void agregarAlumno(Alumno unAlumno) {
        listaAlumnos.add(unAlumno);
    }

    public static void agregarProfesor(Profesor unProfesor) {
        listaProfesores.add(unProfesor);
    }

    public static void agregarCoordinador(Coordinador unCoordinador) {
        listaCoordinadores.add(unCoordinador);
    }
    public static void agregarCarrera(Carrera unaCarrera) {
        listaCarreras.add(unaCarrera);
    }
    public static void agregarMateria(Materia unaMateria) {
        listaMaterias.add(unaMateria);
    }
    public static void agregarMatricula(Matricula unaMatricula) {
        listaMatriculas.add(unaMatricula);
    }

    //para ver si existe el alumno
    public static boolean existeAlumno(Long NroLegajo){
        boolean existe=false;
        int tamaLista = listaAlumnos.size();
        for (int i=0;i<tamaLista;i++){
            if (listaAlumnos.get(i).getNroLegajo().equals(NroLegajo)){
                existe=true;
                break;
            }
        }
        return existe;
    }

    public static Alumno obtenerAlumnoPorIdentificacion(Long NroLegajo){
        Alumno unAlumno=null;
        for (int i=0;i<listaAlumnos.size();i++){
            if (listaAlumnos.get(i).getNroLegajo().equals(NroLegajo)){
                unAlumno=listaAlumnos.get(i);
                break;
            }
        }
        return unAlumno;
    }
    public static boolean estaMatriculado(Matricula unaMatricula){
        boolean existe=false;
        Long nroLegajo = unaMatricula.getAlumno().getNroLegajo();
        String codigoMateria = unaMatricula.getMateria().getCodigo();
        for(int i=0;i<listaMatriculas.size();i++){
            if(listaMatriculas.get(i).getAlumno().getNroLegajo().equals(nroLegajo)
                    && listaMatriculas.get(i).getMateria().getCodigo().equals(codigoMateria)){
                existe=true;
                break;
            }
        }
        return existe;
    }



    public static List<Asistencia>
    obtenerAsistenciasPorMateria(Materia materia){
        return listaAsistencias.stream()
                .filter(asistencia ->asistencia
                        .getMateria().equals(materia))
                .collect(Collectors.toList());

    }

    public static List<Asistencia>
    obtenerAsistenciasPorAlumno(Alumno alumno){
        return listaAsistencias.stream()
                .filter(asistencia ->asistencia
                        .getAlumno().equals(alumno))
                .collect(Collectors.toList());

    }


    public static long contarInasistenciaPorAlumno(Alumno alumno) {
        return listaAsistencias.stream()
                .filter(asistencia -> asistencia
                        .getAlumno().equals(alumno) &&
                        !asistencia.isPresente())
                .count();
    }

    public static long contarInasistenciasPorMateria(Materia materia) {
        return listaAsistencias.stream()
                .filter(asistencia ->asistencia
                        .getMateria().equals(materia)&&
                        !asistencia.isPresente())
                .count();
    }
}
