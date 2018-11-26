/* 
 * Arbol.java
 *
 * Version 1.0. Esta clase es un arbol que permite ver la informacion de los
 * paquetes capturados o simulados.
 *
 */

package ve.com.kuery.spyke.igu.ayuda;

import javax.swing.*;
import javax.swing.tree.*;

public class Arbol extends JTree
{
    private String idioma;
    private String raiz;
    private DefaultTreeModel modelo;
    private JEditorPane editor;
    
    public Arbol(String idioma, String raiz, JEditorPane editor)
    {
        modelo = new DefaultTreeModel(new DefaultMutableTreeNode("Contenido"));
        this.idioma = idioma;
        this.raiz = raiz;
        this.editor = editor;
    
        String spyke[] = {"Trabajando con spyke"};
        String interfazGrafica[] = {"Conociendo la interfaz grafica de spyke"};
        String PantallaPrincipal[] = {"Pantalla Principal"};
        String Menus[] = {"Menus"};
        String Operaciones[] = {"Realizando operaciones basicas"};
        String AbrirArchivo[] = {"Abrir Archivo"};
        String GuardarArchivo[] = {"Guardar Archivo"};
        String ImprimirArchivo[] = {"Imprimir Archivo"};
        String Captura[] = {"Realizar captura de paquetes"};
        String propiedadesCap[] = {"Definir propiedades de captura"};
        String progCap[] = {"Progreso de captura"};
        String Simular[] = {"Realizar simulacion de paquetes"};
        String cantiPaq[] ={"Definir cantidad de paquetes a simular"};
        String proSim[] = {"Progreso de simulacion"};
        String opcPrin[] = {"Otras Opciones de Spyke"};
        String obtener[] = {"Obtener informacion de paquete"};
        String grafica[] = {"Realizar Graficas"};
        String opciones[] = {"Opciones de Programa"};
        
        Rama rSpyke = new Rama(spyke, true);
        Rama rInterfazGrafica = new Rama(interfazGrafica, true);
        Rama rPantallaPrincipal = new Rama(PantallaPrincipal,false);
        Rama rMenus = new Rama(Menus,false);
        Rama rOperaciones = new Rama(Operaciones,true);
        Rama rAbrirArchivo = new Rama(AbrirArchivo,false);
        Rama rGuardarArchivo = new Rama(GuardarArchivo,false);
        Rama rImprimirArchivo = new Rama(ImprimirArchivo,false);
        Rama rCaptura = new Rama(Captura, true);
        Rama rPropiCap = new Rama(propiedadesCap, false);
        Rama rProgCap = new Rama(progCap, false);
        Rama rSimular = new Rama(Simular,true);
        Rama rCantiPaq = new Rama(cantiPaq,false);
        Rama rSimulacion = new Rama(proSim,false);
        Rama rOpcPrin = new Rama(opcPrin,true);
        Rama rObtener = new Rama(obtener,false);
        Rama rGrafica = new Rama(grafica, false);
        Rama rOpciones = new Rama(opciones, false);
        
        DefaultMutableTreeNode ramaSpyke = rSpyke.getNodo();
        DefaultMutableTreeNode ramaInterfaz = rInterfazGrafica.getNodo();
        DefaultMutableTreeNode ramaPrincipal = rPantallaPrincipal.getNodo();
        DefaultMutableTreeNode ramaMenus = rMenus.getNodo();
        DefaultMutableTreeNode ramaOperaciones = rOperaciones.getNodo();
        DefaultMutableTreeNode ramaAbrir = rAbrirArchivo.getNodo();
        DefaultMutableTreeNode ramaGuardar = rGuardarArchivo.getNodo();
        DefaultMutableTreeNode ramaImprimir = rImprimirArchivo.getNodo();
        DefaultMutableTreeNode ramaCaptura = rCaptura.getNodo();
        DefaultMutableTreeNode ramaPropiCap = rPropiCap.getNodo();
        DefaultMutableTreeNode ramaProgCap = rProgCap.getNodo();
        DefaultMutableTreeNode ramaSimular = rSimular.getNodo();
        DefaultMutableTreeNode ramaCantiPaq = rCantiPaq.getNodo();
        DefaultMutableTreeNode ramaProSim = rSimulacion.getNodo();
        DefaultMutableTreeNode ramaOpcPrin = rOpcPrin.getNodo();
        DefaultMutableTreeNode ramaObtener = rObtener.getNodo();
        DefaultMutableTreeNode ramaGrafica = rGrafica.getNodo();
        DefaultMutableTreeNode ramaOpciones = rOpciones.getNodo();
        
        setModel(null);
        
        modelo.insertNodeInto(ramaSpyke, (MutableTreeNode)modelo.getRoot(),0);       
        modelo.insertNodeInto(ramaInterfaz, ramaSpyke,0);
        modelo.insertNodeInto(ramaPrincipal, ramaInterfaz,0);
        modelo.insertNodeInto(ramaMenus, ramaInterfaz,1);
        modelo.insertNodeInto(ramaOperaciones, ramaSpyke,1);
        modelo.insertNodeInto(ramaAbrir, ramaOperaciones,0);
        modelo.insertNodeInto(ramaGuardar, ramaOperaciones,1);
        modelo.insertNodeInto(ramaImprimir, ramaOperaciones,2);
        modelo.insertNodeInto(ramaCaptura, ramaSpyke,2);
        modelo.insertNodeInto(ramaPropiCap, ramaCaptura,0);
        modelo.insertNodeInto(ramaProgCap, ramaCaptura,1);
        modelo.insertNodeInto(ramaSimular, ramaSpyke,3);
        modelo.insertNodeInto(ramaCantiPaq, ramaSimular,0);
        modelo.insertNodeInto(ramaProSim,ramaSimular,1);
        modelo.insertNodeInto(ramaOpcPrin,ramaSpyke,4);
        modelo.insertNodeInto(ramaObtener,ramaOpcPrin,0);
        modelo.insertNodeInto(ramaGrafica,ramaOpcPrin,1);
        modelo.insertNodeInto(ramaOpciones,ramaOpcPrin,2);
        
        this.addMouseListener(new ControladorArbolAyuda(this,editor));
        setModel(modelo);
    }
}

