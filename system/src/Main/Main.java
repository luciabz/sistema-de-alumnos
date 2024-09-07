package Main;


import Models.AdmiUniversidad;
import Models.Alumno;
import Models.Materia;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan", "Pérez", "12345678", 1, "Computación", "A01");
        Materia materia1 = new Materia("Matemáticas");

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
    }
}


