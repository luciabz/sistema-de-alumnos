package Models;


public class Materia {
    private String nombre;
    private int duracion;
    private Profesor profesor;
    private String carrera;
    private String horario;
    private int aula;
    private int cantidadHoras;
    private String codigo;//id de la materia para dsp ver asistencias en cada una


    //constructor
    public Materia(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.cantidadHoras = 0;
        this.horario = horario;
        this.aula = 0;
        this.profesor = profesor;
        this.carrera = carrera;
        this.duracion = 0;
        this.codigo = codigo;
    }


    //metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidadHoras() {
        return cantidadHoras;
    }
    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public int getAula() {
        return aula;
    }
    public void setAula(int aula) {
        this.aula = aula;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
