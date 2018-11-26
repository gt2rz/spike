/*
 * Version 0.1.0
 * 
 * Fecha de modificacion: 06 de Agosto de 2013
 * 
 * Descripcion: Esta clase permite SERIALIZAR objetos convirtiendolos en
 * archivos que pueden ser guardados en un sistema de archivos
 */

package ve.com.kuery.mag.archivo;

import java.io.*;

public class Serializador {
    
    public void escribir(Object o, String archivo)
            throws FileNotFoundException, IOException{
        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(archivo));
        out.writeObject(o);
        out.close();
    }
    
    public Object leer(String archivo)
            throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream oin = new ObjectInputStream(
                new FileInputStream(archivo));
        Object o = oin.readObject();
        oin.close();
        return o;
    }
}
