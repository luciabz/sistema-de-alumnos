package Models;

public class Matricula{
        private Materia materia;
        private Alumno alumno;


        public Matricula(Materia materia, Alumno alumno) {
            this.materia = materia;
            this.alumno = alumno;
        }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia= materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }


    @Override
    public String toString() {
        return "Matricula{" + "materia=" + materia + ", alumno=" + alumno+ '}';
    }
}
