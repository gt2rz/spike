/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.com.kuery.mag.archivo;

import java.io.*;

public class ArchivoTxt extends Archivo{
            
    public ArchivoTxt(String nombreArchivo) 
              throws FileNotFoundException, IOException{
        super(nombreArchivo);
    }  
      
    public void escribir(boolean append) throws IOException{
        BufferedWriter b = new BufferedWriter(
                    new FileWriter(this.getNombreArchivo(),append));
        PrintWriter e = new PrintWriter(b);
        metodoEscribir(e);
        e.close();
        b.close();
    }
      
    public void metodoEscribir(PrintWriter p){}
    
    public void leer()throws IOException{
        String linea;
        BufferedReader b = new BufferedReader(
                new FileReader(this.getNombreArchivo()));
        while ((linea = b.readLine())!=null){
           metodoLeer(linea);
        }
        b.close();
    }
         
    public void metodoLeer(String linea){}
}
