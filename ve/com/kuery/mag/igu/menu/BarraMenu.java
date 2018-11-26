/* 
 * BarraMenu.java
 *
 * Version 1.0. Esta clase extiende funcionalidades para la creacion de una
 * barra de menu
 *
 */

package ve.com.kuery.mag.igu.menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class BarraMenu extends JMenuBar{
    private ActionListener a;
    
    public BarraMenu(){
        this(null);
    }
    
    public BarraMenu(ActionListener a){
        this.a = a;
        setBorder(new LineBorder(new Color(200,200,200)));
    }
    
    public ActionListener getControladorAccion(){
        return a;
    }
   
}
