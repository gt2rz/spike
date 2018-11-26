/* 
 * Pantalla.java
 *
 * Version 1.0. Esta clase permite obtener diversos parametros de la pantalla.
 *
 */

package ve.com.kuery.mag.igu.pantalla;

import java.awt.*;
public class Pantalla{
    private static Dimension tamanoPantalla;      
    private static int resolucionPantalla;
	
    public Pantalla() throws HeadlessException{
        tamanoPantalla = Toolkit.getDefaultToolkit().getScreenSize();   
        resolucionPantalla = Toolkit.getDefaultToolkit().getScreenResolution(); 
    }

    public int getAncho(){
        return tamanoPantalla.width;
    }

    public int getAlto(){
        return tamanoPantalla.height;
    }

    public int getResolucion(){
        return resolucionPantalla;
    }

};