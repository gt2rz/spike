/* 
 * BarraEstado.java
 *
 * Version 1.0. Esta clase crea una barra de estado.
 */

package ve.com.kuery.mag.igu;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BarraEstado extends JPanel
{
	private JLabel mensaje;
		
	public BarraEstado()
	{
            setLayout(new FlowLayout(FlowLayout.LEFT,2,2));
            setBorder(new LineBorder(new Color(200,200,200)));
            mensaje = new JLabel();
            setPreferredSize(new Dimension(0,20));
            add(mensaje);
	}
                  
        public void setMensaje(String m)
        {
            mensaje.setText(m);
        }

        public String getMensaje()
        {
            return mensaje.getText();
        }
};
