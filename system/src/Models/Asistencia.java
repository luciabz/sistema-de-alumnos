package Models;

import java.time.LocalDate;

public class Asistencia {
    private Alumno alumno;
    private Materia materia;
    private LocalDate fecha;
    private boolean presente;

    public Asistencia(Alumno alumno, Materia materia, LocalDate fecha, boolean presente) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = fecha;
        this.presente = presente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }
    public boolean isPresente() {
        return presente;
    }


}
