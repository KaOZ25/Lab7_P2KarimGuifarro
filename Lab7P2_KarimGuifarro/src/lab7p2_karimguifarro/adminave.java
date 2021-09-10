/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_karimguifarro;

import java.io.*;
import java.util.ArrayList;
public class adminave {
    private ArrayList<nave> listanave = new ArrayList();
    private File arch = null;

    public adminave(String path) {
        arch= new File(path);
    }

    public ArrayList<nave> getListanave() {
        return listanave;
    }

    public void setListanave(ArrayList<nave> listanave) {
        this.listanave = listanave;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }
    public void setNave(nave a){
        listanave.add(a);
    }

    @Override
    public String toString() {
        return "adminave{" + "listanave=" + listanave + ", arch=" + arch + '}';
    }
    
     public void cargarArchivo() {
        try {
            listanave = new ArrayList();
            nave temp;
            if (arch.exists()) {
                FileInputStream entrada
                        = new FileInputStream(arch);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (nave) objeto.readObject()) != null) {
                        listanave.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
       public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(arch);
            bw = new ObjectOutputStream(fw);
            for (nave t : listanave) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
