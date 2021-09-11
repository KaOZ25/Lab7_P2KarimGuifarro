/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_karimguifarro;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;

/**
 *
 * @author Karim Ozael
 */
public class Hilo1 extends Thread {

    private JProgressBar prg_c;
    int consumo;
    private boolean avanzar;
    private boolean vive;

    public Hilo1(JProgressBar prg_c, int consumo) {
        this.prg_c = prg_c;
        this.consumo = consumo;
        avanzar = true;
        vive = true;
    }

   

    public JProgressBar getPrg_c() {
        return prg_c;
    }

    public void setPrg_c(JProgressBar prg_c) {
        this.prg_c = prg_c;
    }


    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
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

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                int d = 1;
                prg_c.setValue(prg_c.getMaximum()
                        - d / (consumo)
                );
            }//FIN IF
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }

    }
}
