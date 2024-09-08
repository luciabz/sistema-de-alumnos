package Models;

import java.util.ArrayList;
import java.util.List;


public class Profesor {
    private String nombre;
    private List<Materia> materias;
    // Constructor
    public Profesor(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<>();  // Inicializamos la lista de materias
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia materia) {
        this.materias.add(materia); // Añadimos una materia a la lista
    }

    public List<Materia> getMaterias() {
        return materias; // Devolvemos la lista de materias
    }


}

