/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_karimguifarro;

import java.io.*;
import java.util.ArrayList;

public class adminastro {

    private ArrayList<astronuta> listaastro = new ArrayList();
    private File arch = null;

    public adminastro(String path) {
        arch = new File(path);
    }

    public ArrayList<astronuta> getListaastro() {
        return listaastro;
    }

    public void setListaastronauta(ArrayList<astronuta> listaPersonas) {
        this.listaastro = listaPersonas;
    }

    public File getArchivo() {
        return arch;
    }

    public void setArchivo(File arch) {
        this.arch = arch;
    }
      public void setAstronuta(astronuta a){
        listaastro.add(a);
    }
    
    @Override
    public String toString() {
        return "adminastro{" + "listaastro=" + listaastro + '}';
    }
    public void cargarArchivo() {
        try {
            listaastro = new ArrayList();
            astronuta temp;
            if (arch.exists()) {
                FileInputStream entrada
                        = new FileInputStream(arch);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (astronuta) objeto.readObject()) != null) {
                        listaastro.add(temp);
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
            for (astronuta t : listaastro) {
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
