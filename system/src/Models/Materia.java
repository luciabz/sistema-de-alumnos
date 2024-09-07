package Models;


public class Materia {
    private String nombre;
    private int duracion;
    private String profesor;
    private String carrera;
    private String horario;
    private String aula;
    private int cantidadHoras;


    //constructor
    public Materia(String nombre) {
        this.nombre = nombre;
    }


    //metodos
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
