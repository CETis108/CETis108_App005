package mx.edu.cetis108.cetis108_app005;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Neil on 13/06/2017.
 */

public class MyAdapter extends ArrayAdapter<String>{
    String[]nombre;
    String[]ruta;
    String[]fecha;
    Context mContext;
    public MyAdapter(Context context, String [] nombre, String [] ruta, String [] fecha){
        super(context, R.layout.archivo_layout);
        this.nombre=nombre;
        this.ruta=ruta;
        this.fecha=fecha;
        this.mContext=context;
    }
    @Override
    public int getCount(){
        return nombre.length;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder mViewHolder=new ViewHolder();
        if(convertView==null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.archivo_layout, parent, false);
            mViewHolder.lblNombre = (TextView) convertView.findViewById(R.id.txtNombre);
            mViewHolder.lblRuta = (TextView) convertView.findViewById(R.id.txtRuta);
            mViewHolder.lblFecha = (TextView) convertView.findViewById(R.id.txtFecha);
            convertView.setTag(mViewHolder);
        }else{
            mViewHolder=(ViewHolder)convertView.getTag();
        }
            mViewHolder.lblNombre.setText(nombre[position]);
            mViewHolder.lblRuta.setText(ruta[position]);
            mViewHolder.lblFecha.setText(fecha[position]);
        return convertView;
    }
    static class ViewHolder{
        TextView lblNombre;
        TextView lblRuta;
        TextView lblFecha;
    }
}
