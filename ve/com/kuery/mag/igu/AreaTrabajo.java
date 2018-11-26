/* 
 * AreaTrabajo.java
 *
 * Version 1.0. Esta clase permite crear una area de trabajo para el desarrollo 
 * de la aplicacion.
 *
 */

package ve.com.kuery.mag.igu;

import java.awt.*;
import javax.swing.*;

public class AreaTrabajo extends JPanel{
    private Image imagen;
    private JPanel contenido;
	
    public void setImagen(String ruta){
        imagen = Toolkit.getDefaultToolkit().getImage(ruta);
        MediaTracker tracker = new MediaTracker(this);
        tracker.addImage(imagen, 1);
        try{
            if(!tracker.waitForID(1, 100000)){
                System.out.println( "Error en la carga de la imagen" );
                System.exit(1);    
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
	
    public void paintComponent(Graphics g){
        g.drawImage(imagen,0,0,800,480,this);
    }

    public void agregarContenido(JComponent contenido){
        if(this.contenido!=null){
            remove(this.contenido);
        }
//            this.contenido = contenido;
        add(contenido,"Center");
        Graphics g = this.getGraphics();
        this.paintAll(g);
    }
        
	
};