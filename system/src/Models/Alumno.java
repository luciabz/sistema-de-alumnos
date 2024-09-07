package Models;

import java.util.ArrayList;
import java.util.List;


    public class Alumno {

        //atributos
        private String nombre;
        private String apellido;
        private String dni;
        private int NroLegajo;
        private String carrera;
        private List<Materia> materiasInscriptas;


        //constructor (siempre debe llamarse como la clase)
        public Alumno() {
            this.materiasInscriptas = new ArrayList<>();
        }


        //metodos
        public void setCarrera(String carrera) //set introduce dato
        {
            this.carrera = carrera;
        }


        public String getCarrera() { //get presenta datp
            return carrera;
        }

    }

