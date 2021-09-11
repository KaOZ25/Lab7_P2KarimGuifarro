/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_karimguifarro;

import java.io.Serializable;

public class nave implements Serializable {

    private String nombre, ID;
    private int max_personas, tiempo_despegue, tiempo_aterrizaje, velcidad, distanciamax, combustible, reserva;
    private static final long SerialVersionUID = 555L;

    public nave() {
    }

    public nave(String nombre, String ID, int max_personas, int tiempo_despegue, int tiempo_aterrizaje, int velcidad, int distanciamax, int combustible, int reserva) {
        this.nombre = nombre;
        this.ID = ID;
        this.max_personas = max_personas;
        this.tiempo_despegue = tiempo_despegue;
        this.tiempo_aterrizaje = tiempo_aterrizaje;
        this.velcidad = velcidad;
        this.distanciamax = distanciamax;
        this.combustible = combustible;
        this.reserva = reserva;
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

    public int getMax_personas() {
        return max_personas;
    }

    public void setMax_personas(int max_personas) {
        this.max_personas = max_personas;
    }

    public int getTiempo_despegue() {
        return tiempo_despegue;
    }

    public void setTiempo_despegue(int tiempo_despegue) {
        this.tiempo_despegue = tiempo_despegue;
    }

    public int getTiempo_aterrizaje() {
        return tiempo_aterrizaje;
    }

    public void setTiempo_aterrizaje(int tiempo_aterrizaje) {
        this.tiempo_aterrizaje = tiempo_aterrizaje;
    }

    public int getVelcidad() {
        return velcidad;
    }

    public void setVelcidad(int velcidad) {
        this.velcidad = velcidad;
    }

    public int getDistanciamax() {
        return distanciamax;
    }

    public void setDistanciamax(int distanciamax) {
        this.distanciamax = distanciamax;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getReserva() {
        return reserva;
    }

    public void setReserva(int reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
