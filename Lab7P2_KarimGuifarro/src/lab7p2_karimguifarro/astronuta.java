package lab7p2_karimguifarro;

import java.io.Serializable;

public class astronuta implements Serializable {

    private String nombre, ID, apellido, nacionalidad, titulo_universitario, contex_fisica;
    private int peso, misiones;
    private static final long SerialVersionUID = 555L;

    public astronuta() {
    }

    public astronuta(String nombre, String ID, String apellido, String nacionalidad, String titulo_universitario, String contex_fisica, int peso, int misiones) {
        this.nombre = nombre;
        this.ID = ID;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulo_universitario = titulo_universitario;
        this.contex_fisica = contex_fisica;
        this.peso = peso;
        this.misiones = misiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulo_universitario() {
        return titulo_universitario;
    }

    public void setTitulo_universitario(String titulo_universitario) {
        this.titulo_universitario = titulo_universitario;
    }

    public String getContex_fisica() {
        return contex_fisica;
    }

    public void setContex_fisica(String contex_fisica) {
        this.contex_fisica = contex_fisica;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMisiones() {
        return misiones;
    }

    public void setMisiones(int misiones) {
        this.misiones = misiones;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
