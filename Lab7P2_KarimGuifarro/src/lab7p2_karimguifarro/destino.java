/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_karimguifarro;

import java.io.Serializable;

public class destino implements Serializable {

    private String tipo, nombre, superficie;
    private int distancia, saturacion_oxigeno;
    private static final long SerialVersionUID = 555L;

    public destino() {
    }

    public destino(String tipo, String nombre, String superficie, int distancia, int saturacion_oxigeno) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.superficie = superficie;
        this.distancia = distancia;
        this.saturacion_oxigeno = saturacion_oxigeno;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getSaturacion_oxigeno() {
        return saturacion_oxigeno;
    }

    public void setSaturacion_oxigeno(int saturacion_oxigeno) {
        this.saturacion_oxigeno = saturacion_oxigeno;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
