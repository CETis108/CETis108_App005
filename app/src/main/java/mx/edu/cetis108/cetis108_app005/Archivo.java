package mx.edu.cetis108.cetis108_app005;

import android.util.Log;

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
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Neil on 07/06/2017.
 */

public class Archivo {
    String sUrl;
    String usuario;
    String nombre;
    String ruta;
    String tipo;
    Date fechaCreacion;
    Date fechaModificacion;

    InputStream is=null;
    String result=null;
    String line=null;
    int code;
    public Archivo(){

    }
    public Archivo(String sUrl, String usuario, String nombre, String ruta, String tipo, Date fechaCreacion, Date fechaModificacion){
        this.sUrl=sUrl;
        this.usuario=usuario;
        this.nombre=nombre;
        this.ruta=ruta;
        this.tipo=tipo;
        this.fechaCreacion=fechaCreacion;
        this.fechaModificacion=fechaModificacion;
    }
    public Archivo(String sUrl, String usuario, String nombre, String ruta, String tipo){
        this.sUrl=sUrl;
        this.usuario=usuario;
        this.nombre=nombre;
        this.ruta=ruta;
        this.tipo=tipo;
    }
    public String registrarArchivo()
    {
        String sRespuesta = "";
        ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

        nameValuePairs.add(new BasicNameValuePair("usuario", usuario));
        nameValuePairs.add(new BasicNameValuePair("nombre", nombre));
        nameValuePairs.add(new BasicNameValuePair("tipo", tipo));
        nameValuePairs.add(new BasicNameValuePair("ruta", ruta));

        try
        {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost(sUrl);
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            is = entity.getContent();
            Log.e("pass 1", "connection success ");
        }
        catch(Exception e)
        {
            Log.e("Fail 1", e.toString());
        }

        try
        {
            BufferedReader reader = new BufferedReader
                    (new InputStreamReader(is,"iso-8859-1"),8);
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null)
            {
                sb.append(line + "\n");
            }
            is.close();
            result = sb.toString();
            Log.e("pass 2", "connection success ");
        }
        catch(Exception e)
        {
            Log.e("Fail 2", e.toString());
        }

        try
        {
            JSONObject json_data = new JSONObject(result);
            code=(json_data.getInt("code"));

            if(code==1)
            {
                sRespuesta = "Archivo creado.";
            }
        }
        catch(Exception e)
        {
            Log.e("Fail 3", e.toString());
        }
        return sRespuesta;
    }
}
