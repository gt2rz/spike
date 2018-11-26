/* 
 * ContraladorArbolAyuda.java
 *
 * Version 1.0. Esta clase permite controlar el contenido de la ayuda.
 *
 */

package ve.com.kuery.spyke.igu.ayuda;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.tree.*;

public class ControladorArbolAyuda extends MouseAdapter
{
    private Arbol arbol;
    private JEditorPane editor;
    
    public ControladorArbolAyuda(Arbol a, JEditorPane editor)
    {
        this.arbol = arbol;
        this.editor = editor;
    }
    
    public void mouseClicked(MouseEvent e)
    {
       TreePath p = ((JTree)e.getSource()).getSelectionPath();
       Object []o = p.getPath();
       String tipo = o[3].toString().trim();
       
       if(tipo.equals("Pantalla Principal"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\PantallaPrincipal.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Menus"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\Menus.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Abrir Archivo"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\AbrirArchivo.htm");
           }
           catch(IOException x){}
       }
       
       if(tipo.equals("Guardar Archivo"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\GuardarArchivo.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Imprimir Archivo"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\ImprimirArchivo.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Definir propiedades de captura"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\PropiedadesCaptura.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Progreso de captura"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\ProgresoCaptura.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Definir cantidad de paquetes a simular"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\CantidadSimulacion.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Progreso de simulacion"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\ProgresoSimulacion.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Obtener informacion de paquete"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\ObtenerInformaciondePaquete.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Realizar Graficas"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\Grafico.htm");
           }
           catch(IOException x){}
       }
       if(tipo.equals("Opciones de Programa"))
       {
           try
           {
              editor.setPage("file:"+System.getProperty("user.dir")+"\\ayuda\\Opciones.htm");
           }
           catch(IOException x){}
       }
    }
}
    
