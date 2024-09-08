package Models;

import java.util.ArrayList;
import java.util.List;


    public class Alumno {

        //atributos
        private String nombre;
        private String apellido;
        private String dni;
        private Long NroLegajo;
        private Long carreraid;
        private List<Materia> materiasInscriptas;

        //constructor (siempre debe llamarse como la clase) inicia los atributos
        public Alumno(String nombre, String apellido, String dni, int NroLegajo, String carreraid, List<Materia> materiasInscriptas) {
            this.materiasInscriptas = new ArrayList<>();
            this.carreraid = carreraid;
            this.nombre = nombre;
            this.apellido = apellido;

        }


        //metodos
        public List<Materia> getMateriasInscriptas() {
            return materiasInscriptas;
        }

        public void setCarreraid(String carreraid) //set introduce dato
        {
            this.carreraid = carreraid;
        }


        public String getCarreraid() { //get presenta datp
            return carreraid;
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

        public Long getNroLegajo() {
            return NroLegajo;
        }
        public void setNroLegajo(Long NroLegajo) {
            this.NroLegajo = NroLegajo;
        }



    }

