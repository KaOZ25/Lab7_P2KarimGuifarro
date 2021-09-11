
package lab7p2_karimguifarro;
import java.io.*;
import java.util.ArrayList;
public class admindest {
     private ArrayList<destino> listadest = new ArrayList();
    private File arch = null;

    public admindest(String path) {
        arch=new File (path);
    }

    public ArrayList<destino> getListadest() {
        return listadest;
    }

    public void setListadest(ArrayList<destino> listadest) {
        this.listadest = listadest;
    }

    public File getArch() {
        return arch;
    }

    public void setArch(File arch) {
        this.arch = arch;
    }
       public void setDestino(destino a){
        listadest.add(a);
    }


    @Override
    public String toString() {
        return "admindest{" + "listadest=" + listadest + '}';
    }
   public void cargarArchivo() {
        try {
            listadest = new ArrayList();
            destino temp;
            if (arch.exists()) {
                FileInputStream entrada
                        = new FileInputStream(arch);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (destino) objeto.readObject()) != null) {
                        listadest.add(temp);
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
            for (destino t : listadest) {
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
 
