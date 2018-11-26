/* 
 * UbicadorEnPantalla.java
 *
 * Version 1.0. Esta clase ubica los componentes graficos en pantalla.
 *
 */

package ve.com.kuery.mag.igu.pantalla;

//import javax.swing.*;

public class UbicadorEnPantalla{
    private int x;
    private int y;
    private Pantalla p;
        
    public UbicadorEnPantalla(int ubicacion, int anchoVentana, int altoVentana)
    {
        p = new Pantalla();    
        int anchoPantalla = p.getAncho();
        int altoPantalla = p.getAlto();
	int x = 0;
	int y = 0;

	switch (ubicacion){				
            case 0:
		x = (anchoPantalla-anchoVentana)/2;        
                y = (altoPantalla-altoVentana)/2;        
        	break; 
            case 1:
                x = (anchoPantalla-anchoVentana)/2;
		y = 0; 
		break; 
            case 2:
                x = (anchoPantalla-anchoVentana)/2; 
		y = altoPantalla-altoVentana;   
		break; 
            case 3:
		x = anchoPantalla-anchoVentana; 
		y = (altoPantalla-altoVentana)/2; 
		break; 
            case 4:
		x =0;
		y = (altoPantalla-altoVentana)/2; 
		break; 
            case 5:
		x = anchoPantalla-anchoVentana; 
		y = 0;
		break;
            case 6:
		x = 0;
		y = 0;
		break; 
            case 7:
		x = 0; 
		y = altoPantalla-altoVentana;
		break; 
            case 8:
		x = anchoPantalla-anchoVentana; 
		y = altoPantalla-altoVentana;
		break; 
            case 9:
		x = (anchoPantalla-anchoVentana)/2; 
		y = altoPantalla-altoVentana;  
		y = y - 30;
		break; 
        }
	this.x = x;
	this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
	return this.y;
    }
};