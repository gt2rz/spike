/* 
 * Ayuda.java
 *
 * Version 1.0. Esta clase permite mostrar la ayuda.
 *
 */

package ve.com.kuery.spyke.igu.ayuda;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import ve.com.kuery.mag.igu.*;

public class Ayuda extends JFrame implements ActionListener
{
    private String idioma;
    private Arbol arbol;
    private Image imagen;
    public Ayuda(String idioma)
    {
       this.idioma = idioma;
       setTitle("Ayuda de spyke...");
       //imagen = Toolkit.getDefaultToolkit().getImage(System.getProperty("java.class.path") + "/com/mag/spyke/interfazGrafica/iconos/iconoVentana.png");
       //setIconImage(imagen);
       BarraEstado estado = new BarraEstado();
       JEditorPane editor=null;
       try
       {
        editor= new JEditorPane("file:"+System.getProperty("java.class.path")+"/ve/com/kuery/spyke/ayuda/index.htm");
       }
       catch(IOException e)
       {
       }
       ContAyuda contenido = new ContAyuda(idioma,editor);
       arbol = new Arbol(idioma,"Contenido",editor);
       ControladorArbolAyuda controlador = new ControladorArbolAyuda(arbol,editor);
       BarraHerramientas barra = new BarraHerramientas(null,null)
       {
            public void componentes()
            {
            }
        };
        getContentPane().add(barra,"North");
        getContentPane().add(estado,"South");
        getContentPane().add(contenido);
        pack();
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    }
}
