package mx.edu.cetis108.cetis108_app005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    }
    public void btnNuevoClick(View v){
        Intent intent=new Intent(MainActivity.this, ArchivoEditar.class);
        startActivity(intent);
        finish();
    }
}
