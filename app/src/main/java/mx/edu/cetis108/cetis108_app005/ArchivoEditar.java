package mx.edu.cetis108.cetis108_app005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

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
     public void btnGuardarClick(View v) throws Exception {
         txtNombre=(EditText)findViewById(R.id.txtNombre);
         txtTipo=(EditText)findViewById(R.id.txtTipo);
         txtRuta=(EditText)findViewById(R.id.txtRuta);
         txtTexto=(EditText)findViewById(R.id.txtTexto);
         WebView webAcceder=(WebView) findViewById(R.id.webAcceder);
         WebView webContenido=(WebView) findViewById(R.id.webContenido);
         Archivo nuevoArchivo=new Archivo(
                "http://innersoft.dnsalias.com/moviles/4ampr/15325061080038/archivo_crear.php",
                "15325061080038",
                txtNombre.getText().toString(),
                txtRuta.getText().toString(),
                txtTipo.getText().toString(),
                txtTexto.getText().toString());
         nuevoArchivo.registrarArchivo(webAcceder, webContenido);
    }
}
