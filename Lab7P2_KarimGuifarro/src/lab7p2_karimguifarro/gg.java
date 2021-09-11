package lab7p2_karimguifarro;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class gg implements Runnable{
   private JProgressBar barra;
   private  JProgressBar bar2;
   private boolean flag;

    public gg(JProgressBar barra,JProgressBar bar2 ) {
        this.barra = barra;
        this.bar2 = bar2;
        flag=false;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public JProgressBar getBar2() {
        return bar2;
    }

    public void setBar2(JProgressBar bar2) {
        this.bar2 = bar2;
    }
   public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    @Override
    public void run() {         
        while(true){            
            try {
                File f=new File("./mision.txt");
                FileWriter fw=new FileWriter(f,true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.newLine();
                bw.flush();
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
