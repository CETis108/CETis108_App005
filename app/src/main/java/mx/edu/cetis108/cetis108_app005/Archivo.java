package mx.edu.cetis108.cetis108_app005;

import android.content.Context;
import android.util.Log;
import android.webkit.WebView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.sql.*;

/**
 * Created by Neil on 07/06/2017.
 */

public class Archivo {
    String sUrl;
    String usuario;
    String nombre;
    String ruta;
    String tipo;
    Contenido contenido;
    Date fechaCreacion;
    Date fechaModificacion;

    InputStream is=null;
    String result=null;
    String line=null;
    int code;
    public Archivo(String sUrl, String usuario, String nombre, String ruta, String tipo, Date fechaCreacion, Date fechaModificacion){
        this.sUrl=sUrl;
        this.usuario=usuario;
        this.nombre=nombre;
        this.ruta=ruta;
        this.tipo=tipo;
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
