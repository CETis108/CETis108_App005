package mx.edu.cetis108.cetis108_app005;

import java.util.Date;

/**
 * Created by Neil on 07/06/2017.
 */

public class Archivo {
    String usuario;
    String nombre;
    String ruta;
    String tipo;
    Date fechaCreacion;
    Date fechaModificacion;
    public Archivo(){

    }
    public Archivo(String usuario, String nombre, String ruta, String tipo, Date fechaCreacion, Date fechaModificacion){
        this.usuario=usuario;
        this.nombre=nombre;
        this.ruta=ruta;
        this.tipo=tipo;
        this.fechaCreacion=fechaCreacion;
        this.fechaModificacion=fechaModificacion;
    }
}
