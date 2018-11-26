/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.com.kuery.mag.igu;

import java.io.*;
import javax.swing.*;

public class Archivo_igu {
    private String ruta;
    private JFileChooser fc; 
    
    public Archivo_igu(){
        fc = new JFileChooser();
    }
    
    public void Abrir(){
//       chooser.addChoosableFileFilter(new FileFilter());
       switch (fc.showOpenDialog(new JFrame())){
            case JFileChooser.APPROVE_OPTION:
                File f = fc.getSelectedFile();
                ruta = (f.getPath());
                break;
            case JFileChooser.CANCEL_OPTION:
                break;
            case JFileChooser.ERROR_OPTION:
                break;
        }
    }
    
    public void Guardar(){
//        fc.addChoosableFileFilter(new JavaCodeFilter());
        fc.showSaveDialog(new JFrame());
        ruta = fc.getSelectedFile().getPath(); 
      
//        switch (choix) 
//        {
//            case JFileChooser.APPROVE_OPTION:
//            break;
//            case JFileChooser.CANCEL_OPTION:
//            break;
//            case JFileChooser.ERROR_OPTION:
//            break;
//        }
    }
    
    public String getRuta()
    {
        return ruta;
    }
}
