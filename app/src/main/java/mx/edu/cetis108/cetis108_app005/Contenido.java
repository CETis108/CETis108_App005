package mx.edu.cetis108.cetis108_app005;

import java.util.Date;

/**
 * Created by Neil on 08/06/2017.
 */

public class Contenido {
    String usuario;
    String nombre;
    String tipo;
    String ruta;
    Date fecha;
    String texto;
    public Contenido(){

    }
    public Contenido(String usuario, String nombre, String tipo, String ruta, Date fecha, String texto){
        this.usuario=usuario;
        this.nombre=nombre;
        this.tipo=tipo;
        this.ruta=ruta;
        this.fecha=fecha;
        this.texto=texto;
    }
}
