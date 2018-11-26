/* 
 * ItemMenu.java
 *
 * Version 1.0. Esta clase permite crear items de memu.
 *
 */

package ve.com.kuery.mag.igu.menu;

import javax.swing.*;

public class ItemMenu extends JMenu
{
    public ItemMenu(String etiqueta)
    {
        this(etiqueta, "");
    }
      
    public ItemMenu(String etiqueta, char mnemonic)
    {
        this(etiqueta, mnemonic, "");
    }
    
    public ItemMenu(String etiqueta, String icono)
    {
        this(etiqueta,' ',icono);
    }
            
    public ItemMenu(String etiqueta, char mnemonic, String icono)
    {
        setText(etiqueta);
        setMnemonic(mnemonic);
        setIcon(new ImageIcon(getClass().getResource(icono)));
    }
}