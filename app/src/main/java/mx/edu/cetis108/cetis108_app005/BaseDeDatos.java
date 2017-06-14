package mx.edu.cetis108.cetis108_app005;

import android.content.Context;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import java.lang.*;

/**
 * Created by Neil on 14/06/2017.
 */

public class BaseDeDatos {
    // IP de mi Url
    String IP = "http://innersoft.dnsalias.com/moviles/4ampr/15325061080038";
    // Rutas de los Web Services
    String GET = IP + "/archivo_listar.php";
    public static void consultaArchivo(Context context, ListView lstArchivos){

    }
}
