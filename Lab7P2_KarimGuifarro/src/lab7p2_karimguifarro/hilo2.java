/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_karimguifarro;

import javax.swing.JProgressBar;

public class hilo2 {

    private JProgressBar barra2;
    int reser;
    private boolean avanzar;
    private boolean vive;

    public hilo2(JProgressBar barra2, int reser) {
        this.barra2 = barra2;
        this.reser = reser;
        avanzar = true;
        vive = true;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }


    

    public int getReser() {
        return reser;
    }

    public void setReser(int reser) {
        this.reser = reser;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public void run() {
        while (vive) {
            if (avanzar) {
                barra2.setValue(
                        reser
                );
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {

            }
        }

    }

}
