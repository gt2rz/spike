/* 
 * MainWindow.java
 *
 * Version 1.0. Esta clase permite controlar la ventana principal del software.
 *
 */

package ve.com.kuery.mag.igu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import ve.com.kuery.mag.igu.menu.BarraMenu;
import ve.com.kuery.mag.igu.pantalla.*;

public class MainWindow extends JFrame{
    private UbicadorEnPantalla u;
    private AreaTrabajo at;
    private BarraMenu bm;
    private BarraEstado be;
    private int ancho;
    private int alto;
    
    public MainWindow(String titulo){
        this(titulo,800,600);
    }
    
    public MainWindow(String titulo, int ancho, int alto){
        setTitle(titulo);
        this.ancho = ancho;
        this.alto = alto;
        this.setUbicacionRelativa(new Ubicacion().CENTRO);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        at = new AreaTrabajo();
        getContentPane().add(at,"Center");
        
        bm = new BarraMenu();
        be = new BarraEstado();
        
        setJMenuBar(bm);
    }
    
    public void setBarraMenu(BarraMenu b){
        this.bm = b;
    }
    
    public BarraMenu getBarraMenu(){
        return bm;
    }
    
    public void setBarraEstado(BarraEstado b){
        this.be = b;
    }
    
    public BarraEstado getBarraEstado(){
        return be;
    }
    
    public void agregarBarraEstado(){
        getContentPane().add(getBarraEstado(),"South");
    }
    
    public void setIcono(String ruta){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(ruta));         
    }
    
    public void setIconoFromBuildClass(String ruta){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("java.class.path") + ruta));
    }
    
    public void setUbicacionRelativa(int u){
        UbicadorEnPantalla uep = new UbicadorEnPantalla(u, this.ancho, this.alto);
        setBounds(uep.getX(), uep.getY(), this.ancho, this.alto);
    }
    
    public void agregar(Component componente, String ubicacion){
//        getContentPane().add(componente, ubicacion);
//        if(ubicacion.equals("Center")){
//            areaTrabajo = (AreaTrabajo)componente;
//        }       
    }
    
    public AreaTrabajo getAreaTrabajo(){
        return at;
    }
    
    public void setControlador(WindowListener w){}

    public void determinarLookInterfaz(String a){
        try{
            if(a.equals("Metal")){
                UIManager.setLookAndFeel("Metal");
            }else if(a.equals("Sistema")){
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }else if(a.equals("Motif")){
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            }
        }catch(Exception e){}
    }
}


