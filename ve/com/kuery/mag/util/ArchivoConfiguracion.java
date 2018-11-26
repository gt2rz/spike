/* 
 * ArchivoConfiguracion.java
 *
 * Version 1.0. Esta version controla el archivo configuracion donde se encuentra 
 * idioma y la apariencia del software.
 */

package ve.com.kuery.mag.util;

import java.io.*;

public class ArchivoConfiguracion implements Serializable
{
    private String idioma;
    private String look;
    private boolean bienvenida;
    private boolean proCaptura;
    
    public boolean getBienvenida()
    {
        return bienvenida;
    }
    
    public void setBienvenida(boolean b)
    {
        bienvenida = b;
    }
    
    public boolean getProCaptura()
    {
        return proCaptura;
    }
    
    public void setProCaptura(boolean b)
    {
        proCaptura = b;
    }
    
    public String getIdioma()
    {
        return idioma;
    }
    
    public void setIdioma(String idioma)
    {
        this.idioma = idioma;
    }
    
    public String getLook()
    {
        return look;
    }
    
    public void setLook(String look)
    {
        this.look = look;
    }
}
