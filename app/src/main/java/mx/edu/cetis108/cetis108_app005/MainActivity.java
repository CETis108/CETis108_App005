package mx.edu.cetis108.cetis108_app005;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.impl.cookie.DateUtils;
import org.w3c.dom.Text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lstArchivos=(ListView)findViewById(R.id.lstArchivos);
        String[]nombre=new String[12];
        String[]ruta=new String[12];
        String[]fecha=new String[12];
        for(int i=0; i<nombre.length; i++) {
            nombre[i] = "archivoNum" + String.valueOf(i + 1);
            ruta[i] = "rutaDispositivo" + String.valueOf(i + 1);
            fecha[i] = "2017-06-13";
        }
        MyAdapter adapter=new MyAdapter(this, nombre, ruta, fecha);
        lstArchivos.setAdapter(adapter);

    }
    public void btnNuevoClick(View v){
        Intent intent=new Intent(MainActivity.this, ArchivoEditar.class);
        startActivity(intent);
        finish();
    }
}
