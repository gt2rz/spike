/* 
 * ItemBarraHerramientas.java
 *
 * Version 1.0. Esta clase permite crear items que pueden ser
 * introducidos en la barra de herramientas.
 *
 */

package ve.com.kuery.mag.igu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ItemBarraHerramientas extends JButton
{
	private BarraEstado be;
	private String mensaje;
        private String identificador;
        private String tipText;
        private Color color;
	
        public ItemBarraHerramientas()
        {
            this("","",null,null,"","");
        }
        
        public ItemBarraHerramientas(BarraEstado be)
        {
            this("","",null,be,"","");
        }
        
        public ItemBarraHerramientas(String icono, String tipText)
        {
            this(icono,"",null,null,"",tipText);
        }
        
	public ItemBarraHerramientas(String icono, String identificador, ActionListener a, BarraEstado be, String mensaje, String tipText)
	{
            setBarraEstado(be);
            setMensaje(mensaje);
            setIdentificador(identificador);
            setControladorAccion(a);
            setTipText(tipText);
            setIcon(new ImageIcon(getClass().getResource(icono)));
            setActionCommand(identificador);
            setToolTipText(tipText);
            setFocusable(false);
            setBorderPainted(false);
            this.setOpaque(false);
		addMouseListener(new MouseAdapter()
		{
                    public void mouseEntered(MouseEvent me)
                    {
                        rolloverEntrada(me);
                    }

                    public void mouseExited(MouseEvent me)
                    {
                        rolloverSalida(me);
                    }

		});
	}
        
        public void setControladorMouse(MouseListener m)
        {
        }
        
        public void setControladorAccion(ActionListener a)
        {
            this.addActionListener(a);
        }
        
        public void setBarraEstado(BarraEstado be)
        {
            this.be = be;
        }
        
        public BarraEstado getBarraEstado()
        {
            return be;
        }
        
        public void setMensaje(String mensaje)
        {
            this.mensaje = mensaje;
        }
        
        public String getMensaje()
        {
            return mensaje;
        }
        
        public void setIdentificador(String identificador)
	{
            this.identificador = identificador;
            setActionCommand(identificador);
	}

	public String getIdentificador()
	{
            return this.identificador;
	}

	public void setTipText(String tipText)
	{
            this.tipText = tipText;
            setToolTipText(tipText);
	}
        
        public String getTipText()
        {
            return this.tipText;
        }

	public void rolloverEntrada(MouseEvent me)
	{
            setBorderPainted(true);
            setOpaque(true);
            be.setMensaje(mensaje);
	}

	public void rolloverSalida(MouseEvent me)
	{
            setBorderPainted(false);
            setOpaque(false);
            be.setMensaje(" ");
	}
};


