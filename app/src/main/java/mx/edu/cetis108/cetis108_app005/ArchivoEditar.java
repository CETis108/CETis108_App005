package mx.edu.cetis108.cetis108_app005;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArchivoEditar extends AppCompatActivity {
    EditText txtNombre;
    EditText txtTipo;
    EditText txtRuta;
    EditText txtTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archivo_editar);
    }
     public void btnGuardarClick(View v){
        txtNombre=(EditText)findViewById(R.id.txtNombre);
        txtTipo=(EditText)findViewById(R.id.txtTipo);
        txtRuta=(EditText)findViewById(R.id.txtRuta);
        txtTexto=(EditText)findViewById(R.id.txtTexto);
        Archivo nuevoArchivo=new Archivo(
                "http://innersoft.dnsalias.com/moviles/4ampr/15325061080038/archivo_crear.php",
                "15325061080038",
                txtNombre.getText().toString(),
                txtRuta.getText().toString(),
                txtTipo.getText().toString());
        nuevoArchivo.registrarArchivo();
    }
}
