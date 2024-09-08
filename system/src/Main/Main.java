package Main;


import Models.AdmiUniversidad;
import Models.Alumno;
import Models.Materia;
import Models.Profesor;
import Models.SituacionMateria;
import Service.ProfesorService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", "Pérez", "12345678", 1, "Comptación", "A01");

        Profesor profesor1 = new Profesor("Contreras");
        ProfesorService profesorService = new ProfesorService(profesor1);

        Materia materia1 = new Materia("Matemáticas", profesor1);

        profesor1.agregarMateria(materia1); // Asociamos la materia al profesor

        profesor1.registrarSituacionFinal(alumno1, materia1, "Regular");

        AdmiUniversidad.agregarAlumno(alumno1);
        AdmiUniversidad.listaMaterias.add(materia1);

        // Registra la asistencia
        AdmiUniversidad.registrarAsistencia(alumno1, materia1, LocalDate.now(), true);
        //inasistencia
        AdmiUniversidad.registrarAsistencia(alumno1, materia1, LocalDate.now().plusDays(1), false);

        // Consulta asistencias por alumno
        var asistenciasAlumno1 = AdmiUniversidad.obtenerAsistenciasPorAlumno(alumno1);
        System.out.println("Asistencias de " + alumno1.getNombre() + ": " + asistenciasAlumno1.size());

        //consulta inasistencia
        long inasistenciasAlumno1 = AdmiUniversidad
                .contarInasistenciaPorAlumno(alumno1);
        System.out.println("Inasistencias de " + alumno1.getNombre() + ": " + inasistenciasAlumno1);

        // Consulta asistencias por materia
        var asistenciasMateria1 = AdmiUniversidad.obtenerAsistenciasPorMateria(materia1);
        System.out.println("Asistencias en " + materia1.getNombre() + ": " + asistenciasMateria1.size());

        long inasistenciasMateria1= AdmiUniversidad.contarInasistenciasPorMateria(materia1);
        System.out.println("Inasistencias en " + materia1.getNombre() + ": " + inasistenciasMateria1);

        SituacionMateria situacion = profesor1.obtenerSituacionFinal(alumno1, materia1);
        if (situacion != null) {
            System.out.println("=========================================");
            System.out.println("     Situación Final del Alumno");
            System.out.println("=========================================");
            System.out.println("Alumno: " + alumno1.getNombre() + " " + alumno1.getApellido());
            System.out.println("Carrera: " + alumno1.getCarrera());
            System.out.println("-----------------------------------------");
            System.out.println("Materia: " + materia1.getNombre());
            System.out.println("Profesor: " + materia1.getProfesor().getNombre());
            System.out.println("Situación Final: " + situacion.getSituacion());
            System.out.println("=========================================");
        } else {
            System.out.println("=========================================");
            System.out.println("No hay situación final registrada para el alumno: " + alumno1.getNombre() + " en la materia: " + materia1.getNombre());
            System.out.println("=========================================");
        }

    }
}


