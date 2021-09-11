/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_karimguifarro;

import java.io.Serializable;

/**
 *
 * @author Karim Ozael
 */
public class misiones implements Serializable{
    String nombre,exito;

    public misiones(String nombre, String exito) {
        this.nombre = nombre;
        this.exito = exito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getExito() {
        return exito;
    }

    public void setExito(String exito) {
        this.exito = exito;
    }
    
}
