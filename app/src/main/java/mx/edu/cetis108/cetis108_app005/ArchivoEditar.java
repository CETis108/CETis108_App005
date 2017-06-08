package mx.edu.cetis108.cetis108_app005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
    public void btnGuardar(View v){
        Date myDate = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = sm.format(myDate);
        Date dt=new Date();
        try {
            dt = sm.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        txtNombre=(EditText)findViewById(R.id.txtNombre);
        txtTipo=(EditText)findViewById(R.id.txtTipo);
        txtRuta=(EditText)findViewById(R.id.txtRuta);
        txtTexto=(EditText)findViewById(R.id.txtTexto);
        Archivo nuevoArchivo=new Archivo(
                "http://innersoft.dnsalias.com/moviles/4ampr/15325061080038/archivo_crear.php",
                "15325061080038",
                txtNombre.getText().toString(),
                txtRuta.getText().toString(),
                txtTipo.getText().toString(),
                dt, dt);
        if(nuevoArchivo.crearArchivo()=="Archivo creado.")
            Toast.makeText(this, "El archivo ha sido creado.", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "Ocurrió un error al guardar el archivo,\npor favor intente de nuevo.", Toast.LENGTH_SHORT).show();
    }
}
