package mx.edu.cetis108.cetis108_app005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.apache.http.impl.cookie.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Date myDate = new Date();
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = sm.format(myDate);
        Date dt=new Date();
        try {
            dt = sm.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Archivo nuevoArchivo=new Archivo("http://innersoft.dnsalias.com:80/moviles/4ampr/15325061080038/archivo_crear.php?", "15325061080038", "archivoDesdeAndroid", "java", "C:/Users/Neil/", dt, dt);
        nuevoArchivo.crearArchivo();
        Toast.makeText(this, "Se intentó crear el archivo.", Toast.LENGTH_SHORT).show();
    }
}
