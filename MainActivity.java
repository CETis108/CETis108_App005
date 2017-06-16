package mx.edu.cetis108.cetis108_app005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;

import java.lang.*;
import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    ListView lstArchivos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        lstArchivos = (ListView) findViewById(R.id.lstArchivos);
        archivoListar();
    }

    public void btnNuevoClick(View v) {
        Intent intent = new Intent(MainActivity.this, ArchivoEditar.class);
        startActivity(intent);
        finish();
    }
    public void archivoListar(){
        AsyncHttpClient client=new AsyncHttpClient();
        String url="http://innersoft.dnsalias.com/moviles/4ampr/15325061080038/archivo_listar.php";
        client.post(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if(statusCode==200){
                    String result=new String(responseBody);
                    Toast.makeText(MainActivity.this, "Consulta realizada con éxito.", Toast.LENGTH_SHORT).show();
                }
                obtenerDatosJSON(new String(responseBody));
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }
    public ArrayList<String> obtenerDatosJSON(String response){
        ArrayList<String> lista=new ArrayList<String>();
        try{
            JSONArray jsonArray=new JSONArray(response);
            String[] nombre=new String[jsonArray.length()];
            String[] ruta=new String[jsonArray.length()];
            String[] fecha=new String[jsonArray.length()];
            for(int i=0; i<jsonArray.length(); i++){
                Archivo nuevoArchivo=new Archivo(jsonArray.getJSONObject(i).getString("nombre"),
                        jsonArray.getJSONObject(i).getString("tipo"),
                        jsonArray.getJSONObject(i).getString("ruta"),
                        jsonArray.getJSONObject(i).getString("fechaCreacion"),
                        jsonArray.getJSONObject(i).getString("fechaModificacion"));
                nombre[i]=nuevoArchivo.nombre;
                ruta[i]=nuevoArchivo.ruta;
                fecha[i]=nuevoArchivo.fechaCreacion;
            }
            MyAdapter adapter=new MyAdapter(MainActivity.this, nombre, ruta, fecha);
            lstArchivos.setAdapter(adapter);
        }catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }

}