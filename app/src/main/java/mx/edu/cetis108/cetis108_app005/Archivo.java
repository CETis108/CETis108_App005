package mx.edu.cetis108.cetis108_app005;

import android.webkit.WebView;


import java.io.InputStream;
import java.util.Date;

/**
 * Created by Neil on 07/06/2017.
 */

public class Archivo {
    String sUrl;
    String usuario="15325061080038";
    String nombre;
    String ruta;
    String tipo;
    Contenido contenido;
    String fechaCreacion;
    String fechaModificacion;

    InputStream is=null;
    String result=null;
    String line=null;
    int code;
    public Archivo(String nombre, String tipo, String ruta, String fechaCreacion, String fechaModificacion){
        this.nombre=nombre;
        this.tipo=tipo;
        this.ruta=ruta;
        this.fechaCreacion=fechaCreacion;
        this.fechaModificacion=fechaModificacion;
    }
    public Archivo(String sUrl, String usuario, String nombre, String ruta, String tipo, String texto){
        this.sUrl=sUrl;
        this.usuario=usuario;
        this.nombre=nombre;
        this.ruta=ruta;
        this.tipo=tipo;
        this.contenido=new Contenido(usuario, nombre, tipo, ruta, texto);
    }
    public void registrarArchivo(WebView webAcceder, WebView webContenido)
    {
        /*webAcceder.getSettings().setJavaScriptEnabled(true);
        webAcceder.getSettings().setDomStorageEnabled(true);
        webAcceder.loadUrl("http://innersoft.dnsalias.com/moviles/4AMPR/15325061080038/archivo_crear.php?usuario=15325061080038&nombre="+nombre+"&ruta="+ruta+"&tipo="+tipo);
        webContenido.loadUrl("http://innersoft.dnsalias.com/moviles/4AMPR/15325061080038/contenido_crear.php?usuario=15325061080038&nombre="+nombre+"&ruta="+ruta+"&tipo="+tipo+"&contenido="+contenido.texto);
        */

    }
}
