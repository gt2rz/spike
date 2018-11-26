/* 
 * ContAyuda.java
 *
 * Version 1.0. Esta clase permite mostrar el contenido de la ayuda.
 *
 */

package ve.com.kuery.spyke.igu.ayuda;


import javax.swing.*;

public class ContAyuda extends JSplitPane
{
    private String idioma;
    private String titulo;
    private JEditorPane editorPane;
    
    public ContAyuda(String idioma, JEditorPane editor)
    {
        JEditorPane editorPane = null;
        this.idioma = idioma;
        editorPane=editor;
        
            editorPane.setEditable(false);
        
        setOrientation(HORIZONTAL_SPLIT);
        setResizeWeight(0.25);
        setLeftComponent(new InfJerarquicaAyuda(idioma,"Contenido",editorPane));
        setRightComponent(new JScrollPane(editorPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
	setOneTouchExpandable(true);
    }
  
    public void setEditor(JEditorPane e)
    {
        setRightComponent(new JScrollPane(e,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
    }
    public String getIdioma()
    {
        return idioma;
    }
};