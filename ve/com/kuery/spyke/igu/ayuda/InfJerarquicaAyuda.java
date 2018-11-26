/* 
 * InfJerarquicaAyuda.java
 *
 * Version 1.0. Esta clase permite mostrar la informacion Jerarquica de la ayuda.
 *
 */

package ve.com.kuery.spyke.igu.ayuda;

import java.awt.*;
import javax.swing.*;
import ve.com.kuery.mag.igu.*;

public class InfJerarquicaAyuda extends JPanel
{
    private String idioma;
    private String titulo;
    private Arbol arbol;
    private JEditorPane editor;
    
    public InfJerarquicaAyuda(String idioma, String titulo,JEditorPane editor)
    {
        this.idioma = idioma;
        this.titulo = titulo;
        this.editor=editor;
        setLayout(new BorderLayout());
        
        arbol = new Arbol(idioma,"Contenido",editor);
        add(new PanelTitulo(idioma, titulo,new Color(80,140,240),new Color(255,255,255),new Color(60,120,235)), "North");
        add(new JScrollPane(arbol, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS), "Center");
    }
    
    public Arbol getArbol()
    {
        return arbol;
    }
}
