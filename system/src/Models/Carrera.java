package Models;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private int id;
    private String nombre;
    private int duracion;
    private Coordinador coordinador;
    private double precioInscripcion;
    private double precioCuota;
    private List<Materia> materias;


    public Carrera(int id,int duracion, String nombre, Coordinador coordinador, List<Materia> materias, double precioCuota, double precioInscripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.coordinador = coordinador;
        this.precioInscripcion = precioInscripcion;
        this.precioCuota = precioCuota;
        this.materias = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public double getPrecioInscripcion() {
        return precioInscripcion;
    }

    public void setPrecioInscripcion(double precioInscripcion) {
        this.precioInscripcion = precioInscripcion;
    }

    public double getPrecioCuota() {
        return precioCuota;
    }

    public void setPrecioCuota(double precioCuota) {
        this.precioCuota = precioCuota;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia materia) {
        this.materias.add(materia);
    }


}
