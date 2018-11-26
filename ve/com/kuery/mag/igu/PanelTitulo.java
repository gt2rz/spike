/* 
 * PanelTitulo.java
 *
 * Version 1.0. Esta clase crea un panel con un titulo que puede ser introducido
 * en un panel titulado.
 *
 */

package ve.com.kuery.mag.igu;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelTitulo extends JPanel
{
    private String idioma;
    private String titulo;
    private Color color;
    
    public PanelTitulo(String idioma, String titulo)
    {
        this(idioma, titulo, new Color(0,0,0), new Color(255,255,255),new Color(70,70,70));
    }
    
    public PanelTitulo(String idioma, String titulo, Color color, Color colorLetra)
    {
        this(idioma, titulo, color, colorLetra, null);
    }
    
    public PanelTitulo(String idioma, String titulo, Color color, Color colorLetra, Color colorBorde )
    {
        this.idioma = idioma;
        this.titulo = titulo;
        setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel t = new JLabel(titulo);
        setBackground(color);
        if(colorBorde!=null)
        {
            setBorder(new LineBorder(colorBorde,2));
        }
        t.setForeground(colorLetra);
        add(t);
    }
    
    public String getIdioma()
    {
        return idioma;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
}
