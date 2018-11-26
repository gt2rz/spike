/* 
 * BarraHerramientas.java
 *
 * Version 1.0. Esta clase permite crear una barra de herramientas.
 *
 */

package ve.com.kuery.mag.igu;

import java.awt.event.*;
import javax.swing.*;

public class BarraHerramientas extends JToolBar{
    private boolean rolover;
    private boolean flotable;
    private BarraEstado be;
    private ActionListener a;
    
    public BarraHerramientas(){
        this(null, null);
    }
    
    public BarraHerramientas(BarraEstado be, ActionListener a){
	this(be, true, false,a);
    }

    public BarraHerramientas(boolean r, boolean f){
        this(null,r,f,null);
    }
    
    public BarraHerramientas(BarraEstado b, boolean r, boolean f, ActionListener a)
    {
	setRollover(r);
        setFloatable(f);
        this.be = b;
        this.a = a;
        componentes();
    }

    public void setControladorMouse(MouseListener m){}
    
    
    public ActionListener getControladorAccion(){
        return a;
    }
    
    public void setBarraEstado(BarraEstado be){
        this.be = be;
    }
    
    public BarraEstado getBarraEstado(){
        return be;
    }
        
    public void componentes()
    {
    }
    
};