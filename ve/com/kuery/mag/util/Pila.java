/* 
 * Pila.java
 *
 * Version 1.0. Esta version controla la pila la cual sera utilizara cada vez 
 * que se haga una captura o simulacion. 
 */

package ve.com.kuery.mag.util;

import java.util.*;
import java.io.*;

public class Pila implements Serializable
{
    private Vector pila;
   
    public Pila()
    {
        pila = new Vector(0, 1);
    }
    
    public void escribir(Object objeto)
    {
        pila.add(objeto);
    }
    
    public Vector getDatos()
    {
        return pila;
    }
    
    public Object leer(int i)
    {
        return pila.get(i);
    }
    
    public int Longitud()
    {
        return pila.size();
    }
}

