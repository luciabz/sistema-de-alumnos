package Models;

public class SituacionMateria {
    private Alumno alumno;
    private Materia materia;
    private String situacion;

    public SituacionMateria(Alumno alumno, Materia materia, String situacion){
        this.alumno = alumno;
        this.materia = materia;
        this.situacion = situacion;
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

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    @Override
    public String toString() {
        return "SituacionMateria{" +
                "alumno=" + alumno.getNombre() + " " + alumno.getApellido() +
                ", materia=" + materia.getNombre() +
                ", situacion='" + situacion + '\'' +
                '}';
    }
}
