/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.com.kuery.mag.archivo;

import java.io.*;

public class Archivo implements Serializable{
    private String nombreArchivo;
    
    public Archivo(String nombreArchivo){
        if(nombreArchivo.isEmpty()){
            // Completar
        }else{
            this.nombreArchivo = nombreArchivo;
        }        
    }    
    public String getNombreArchivo(){
        return this.nombreArchivo;
    }
}

