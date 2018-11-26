/* 
 * InfJerarquicaAyuda.java
 *
 * Version 1.0. Esta clase permite mostrar la informacion por Rama de la ayuda.
 *
 */

package ve.com.kuery.spyke.igu.ayuda;

import javax.swing.tree.*;

public class Rama
{
    private DefaultMutableTreeNode rama;
    public Rama( String datos[], boolean b) 
    {
        rama = new DefaultMutableTreeNode( datos[0] );
        for( int i=1; i < datos.length; i++ )
        {
            rama.add( new DefaultMutableTreeNode( datos[i],b ) );
            rama.setAllowsChildren(b);
        }
    }
  
    public DefaultMutableTreeNode getNodo() 
    { 
        return rama ; 
    }
}
