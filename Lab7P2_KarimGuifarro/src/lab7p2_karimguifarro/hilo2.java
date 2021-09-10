/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_karimguifarro;

import javax.swing.JProgressBar;

public class hilo2 {
     private JProgressBar barra2;
    private boolean avanzar;
    private boolean vive;

    public hilo2(JProgressBar barra2) {
        this.barra2 = barra2;
        avanzar = true;
        vive = true;
    }

    public hilo2(JProgressBar barra2, boolean avanzar, boolean vive) {
        this.barra2 = barra2;
        this.avanzar = avanzar;
        this.vive = vive;
    }
    
}
