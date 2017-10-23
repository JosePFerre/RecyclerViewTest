package com.midominio.ferre.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JosePablo on 18/10/2017.
 */

public class AdaptadorAlumnos extends RecyclerView.Adapter<AdaptadorAlumnos.AlumnosViewHolder> implements View.OnClickListener{

    private ArrayList<Alumno> datos;
    private View.OnClickListener listener;

    public AdaptadorAlumnos(ArrayList<Alumno> datos) {
        this.datos = datos;
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public AlumnosViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.elementoalumno, viewGroup, false);

        AlumnosViewHolder avh = new AlumnosViewHolder(itemView);

        itemView.setOnClickListener(this);

        return avh;
    }

    @Override
    public void onBindViewHolder(AlumnosViewHolder viewHolder, int position) {
        Alumno item = datos.get(position);

        viewHolder.bindAlumno(item);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    @Override
    public void onClick(View v) {
        if(listener != null){
            listener.onClick(v);
        }
    }

    public class AlumnosViewHolder extends RecyclerView.ViewHolder {

        private TextView nombre;
        private TextView datos;
        private ImageView img;

        public AlumnosViewHolder(View itemView) {
            super(itemView);

            nombre = (TextView)itemView.findViewById(R.id.LblNombre);
            datos = (TextView)itemView.findViewById(R.id.LblDatos);
            img = (ImageView)itemView.findViewById(R.id.Imagen);
        }

        public void bindAlumno(Alumno a) {
            nombre.setText(a.getApellidos() + ", " + a.getNombre());
            datos.setText(a.getClase() + ", " + a.getNivel());

            if(a.getSexo() == "H"){
                img.setImageResource(R.drawable.hombre);
            }else if(a.getSexo() == "M"){
                img.setImageResource(R.drawable.mujer);
            }
            Log.d("Test", "Mensaje de depuración");
        }
    }

}