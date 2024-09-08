package Models;
import java.util.ArrayList;
import java.util.List;

    public class AdmiUniversidad {
        private List<Carrera> listasCarreras = new ArrayList<>();
        private List<Profesor> listaProfesores = new ArrayList<>();
        private List<Alumno> alumnosMatriculados = new ArrayList<>();
        private List<Materia> listaMaterias = new ArrayList<>();
        private List<Coordinador> listaCoordinadores = new ArrayList<>();

        public AdmiUniversidad(List<Materia> listasMaterias, List<Carrera> listasCarreras, List<Alumno> alumnosMatriculados, List<Profesor> listaProfesores, List<Coordinador> listaCoordinadores) {
            this.listaMaterias = new ArrayList<>();
            this.listasCarreras = new ArrayList<>();
            this.alumnosMatriculados = new ArrayList<>();
            this.listaProfesores = new ArrayList<>();
            this.listaCoordinadores = new ArrayList<>();
        }


        public List<Coordinador> getListaCoordinadores() {
            return listaCoordinadores;
        }

        public List<Profesor> getProfesores() {
            return listaProfesores;
        }
        public List<Materia> getListasMaterias() {
            return listaMaterias;
        }

        public List<Carrera> getListasCarreras() {
            return listasCarreras;
        }

        public List<Alumno> getAlumnosMatriculados() {
            return alumnosMatriculados;
        }

    }






