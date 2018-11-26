/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.com.kuery.spyke.igu;

import javax.swing.JSeparator;
import ve.com.kuery.mag.igu.*;
import ve.com.kuery.mag.igu.menu.*;
import ve.com.kuery.spyke.controladores.*;

public class Aplicacion extends MainWindow {
    
    private final String iconos = "/ve/com/kuery/spyke/igu/icono/";
    private BarraHerramientas bh;
    private Aplicacion_controlador a;
    
    public Aplicacion(){
        super("SKYPE - Analizador de Protocolos TCP/IP");
        setIconoFromBuildClass("/ve/com/kuery/spyke/igu/icono/iconoVentana.png");
        
        a = new Aplicacion_controlador();
        
        crearBarraMenu();
        crearBarraHerramientas();
        agregarBarraEstado();
    }
    
    private void crearBarraMenu(){
        ItemMenu archivo = new ItemMenu("Archivo");
        archivo.add(new SubItemMenu("Abrir",iconos + "iconoAbrirMenuArchivo.png",a,"abrir"));
        archivo.add(new SubItemMenu("Guardar",iconos + "iconoGuardarMenuArchivo.png",a,"guardar"));
        archivo.add(new SubItemMenu("Imprimir",iconos + "iconoImprimirMenuArchivo.png",a,"imprimir"));
        archivo.add(new JSeparator());
        archivo.add(new SubItemMenu("Salir",a,"Salir"));
                
        getBarraMenu().add(archivo);
        
        ItemMenu captura = new ItemMenu("Captura");
        captura.add(new SubItemMenu("Iniciar",iconos + "iconoCapturarMenuCaptura.png",a,"capturar"));
        getBarraMenu().add(captura);  
                
        ItemMenu herramientas = new ItemMenu("Herramientas");
        herramientas.add(new SubItemMenu("Graficos",iconos + "iconoGraficosMenuHerramientas.png",a,"graficos"));
        herramientas.add(new SubItemMenu("Simulador",iconos + "iconoSimuladorMenuHerramientas.png",a,"simulador"));
        herramientas.add(new JSeparator());
        herramientas.add(new SubItemMenu("Opciones",iconos + "iconoOpcionesMenuHerramientas.png",a,"opciones"));
        getBarraMenu().add(herramientas);
                
        ItemMenu ayuda = new ItemMenu("Ayuda");
        ayuda.add(new SubItemMenu("Ayuda",iconos + "iconoAyudaMenuAyuda.png",a,"ayuda"));
        ayuda.add(new SubItemMenu("Acerca de...",iconos + "iconoAcercaMenuAyuda.png",a,"acerca"));
        getBarraMenu().add(ayuda);
        
        determinarLookInterfaz("Metal");
    
    }
    
    private void crearBarraHerramientas(){
        bh = new BarraHerramientas(getBarraEstado(),true,true,a);
        bh.add(new ItemBarraHerramientas(iconos + "iconoAbrirMenuArchivo.png", "abrir", a, getBarraEstado(),"Abrir un documento existente...", "Abrir archivo"));
        bh.add( new ItemBarraHerramientas(iconos + "iconoGuardarMenuArchivo.png","guardar",a,getBarraEstado(),"Guardar el documento actual...","Guardar archivo"));
        bh.add( new ItemBarraHerramientas(iconos + "iconoImprimirMenuArchivo.png","imprimir",a, getBarraEstado(),"Imprimir el Documento actual...","Imprimir"));
        bh.addSeparator();
        bh.add( new ItemBarraHerramientas(iconos + "iconoCapturarMenuCaptura.png","capturar",a,getBarraEstado(),"Iniciar una nueva captura de datos en tiempo real...","Capturar datos"));
        bh.add( new ItemBarraHerramientas(iconos + "iconoSimuladorMenuHerramientas.png","simular",a,getBarraEstado(),"Iniciar una nueva Simulacion de captura de datos...","Simular captura de datos"));
        bh.addSeparator();
        bh.add( new ItemBarraHerramientas(iconos + "iconoAyudaMenuAyuda.png","ayuda",a,getBarraEstado(),"Visualizar el asistente de ayuda","Ayuda"));
        
        getContentPane().add(bh,"North");
    }
    
    
}
