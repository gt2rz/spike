/* 
 * PanelTitulado.java
 *
 * Version 1.0. Esta clase permite crear paneles titulados.
 *
 */

package ve.com.kuery.mag.igu;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class PanelTitulado extends JPanel
{
    private String titulo;
    private  String idioma;
    
    public PanelTitulado(String idioma, String titulo)
    {
        this(idioma, titulo, null,null);
    }
    
    public PanelTitulado(String idioma, String titulo, Color color, Color colorLetra)
    {
        this(idioma, titulo, color, colorLetra, null);
    }
    
    public PanelTitulado(String idioma, String titulo, Color color, Color colorLetra, Color colorBorde)
    {
        this.titulo = titulo;
        this.idioma = idioma;
        setLayout(new BorderLayout());
        if (colorBorde==null)
        {
            setBorder(new LineBorder(color, 2));
        }
        else
        {
            setBorder(new LineBorder(colorBorde,2));
        }
        add(new PanelTitulo(idioma,titulo, color, colorLetra, colorBorde),"North");
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public String getIdioma()
    {
        return idioma;
    }
}

