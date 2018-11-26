/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.com.kuery.spyke.controladores;

import java.awt.event.*;
import ve.com.kuery.mag.igu.*;
import ve.com.kuery.spyke.igu.ayuda.*;

public class Aplicacion_controlador implements ActionListener{
    
    public void actionPerformed(ActionEvent e){
        String x = e.getActionCommand();
        Archivo_igu a = new Archivo_igu();
        if(x.equalsIgnoreCase("abrir")){
            a.Abrir();
//            a.getRuta();
        }else if(x.equalsIgnoreCase("ayuda")){
            Ayuda ayuda = new Ayuda("Espanol");
        }else if(x.equalsIgnoreCase("guardar")){
            a.Guardar();
//            a.getRuta();
        }
    }
}
