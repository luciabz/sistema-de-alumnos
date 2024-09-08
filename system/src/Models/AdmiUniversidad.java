package Models;

import java.util.ArrayList;
import java.util.List;

    public class AdmiUniversidad {
        private List<Carrera> carreras = new ArrayList<>();
        private List<Profesor> profesores = new ArrayList<>();
        private List<Alumno> alumnos = new ArrayList<>();


        public AdmiUniversidad(List<Materia> materiasInscriptas, List<Carrera> carreras, List<Alumno> Alumnos) {
            this.listasMaterias = new ArrayList<>();
            this.listasCarreras = new ArrayList<>();
            this.alumnosInscriptos = new ArrayList<>();

        }

        public List<Materia> getListasMaterias() {
            return materia;
        }

        public List<Carrera> getListasCarreras() {
            return carreras;
        }

        public List<Alumno> getAlumnosInscriptos() {
            return Alumnos;
        }
    }






