package Models;

public class Coordinador {
    private String nombre;
    private String datosPersonales;
    private String carreraAsignada;

    // Constructor
    public Coordinador(String nombre, String datosPersonales, String carreraAsignada) {
        this.nombre = nombre;
        this.datosPersonales = datosPersonales;
        this.carreraAsignada = carreraAsignada;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(String datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public String getCarreraAsignada() {
        return carreraAsignada;
    }

    public void setCarreraAsignada(String carreraAsignada) {
        this.carreraAsignada = carreraAsignada;
    }
}
