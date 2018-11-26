/* 
 * SubItemMenu.java
 *
 * Version 1.0. Esta clase permite crear subItems que pueden ser 
 * incluidos en los items menus.
 *
 */

package ve.com.kuery.mag.igu.menu;

import java.awt.event.*;
import javax.swing.*;

public class SubItemMenu extends JMenuItem{
    public SubItemMenu(String etiqueta){
	this(etiqueta, ' ');
    }
    
    public SubItemMenu(String etiqueta, ActionListener a, String id){
        this(etiqueta, " ",a,id);
    }

    public SubItemMenu(String etiqueta, char mnemonic){
	this(etiqueta, mnemonic, " ", null, " ");
    }

    public SubItemMenu(String etiqueta, String icono){
	this(etiqueta, ' ', icono, null, " ");
    }
    
    public SubItemMenu(String etiqueta, String icono, ActionListener a, String id){
        this(etiqueta, ' ', icono, a, id);
    }

    public SubItemMenu(String etiqueta, char mnemonic, String icono, ActionListener a, String id){
        setText(etiqueta);
       	setMnemonic(mnemonic);
        addActionListener(a);
        setActionCommand(id);
	setIcon(new ImageIcon(getClass().getResource(icono)));
    }

}
