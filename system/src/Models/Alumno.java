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
        private String identificacion;

        //constructor (siempre debe llamarse como la clase) inicia los atributos
        public Alumno(String nombre, String apellido, String dni, int NroLegajo, String carrera, String identificacion) {
            this.materiasInscriptas = new ArrayList<>();
            this.identificacion = identificacion;
            this.carrera = carrera;
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.NroLegajo = NroLegajo;
        }


        //metodos
        public void setCarrera(String carrera) //set introduce dato
        {
            this.carrera = carrera;
        }


        public String getCarrera() { //get presenta datp
            return carrera;
        }
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getDni() {
            return dni;
        }
        public void setDni(String dni) {
            this.dni = dni;
        }

        public int getNroLegajo() {
            return NroLegajo;
        }
        public void setNroLegajo(int NroLegajo) {
            this.NroLegajo = NroLegajo;
        }
        public String getIdentificacion() {
            return identificacion;
        }
        public void setIdentificacion(String identificacion) {
            this.identificacion = identificacion;
        }


    }

