package com.midominio.ferre.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView LstAlumnos;
    private ArrayList<Alumno> datos;
    private RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        datos = new ArrayList<Alumno>();
        anadirDatos(datos);

        recView = (RecyclerView) findViewById(R.id.RecViewAlumnos);
        recView.setHasFixedSize(true);

        final AdaptadorAlumnos adaptador = new AdaptadorAlumnos(datos);

        adaptador.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               Log.d("Prueba", "Pulsado el" + recView.getChildAdapterPosition(v));
               datos.get(recView.getChildAdapterPosition(v)).setNombre("(Has pulsado este elemento)");
               recView.setAdapter(adaptador);
           }
        });

        recView.setAdapter(adaptador);

        recView.setLayoutManager( new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }

    public void anadirDatos(ArrayList<Alumno> datos){
                datos.add(new Alumno("Juan", "Merino","H","2ºC","Bachiller"));
                datos.add(new Alumno("Pepe", "Perez","H","1ºA","Bachiller"));
               datos.add(new Alumno("Paco", "Porras","H","2ºA","ESO"));
               datos.add(new Alumno("Manuel", "Antunez", "H", "2ºA","Multiplataforma"));
               datos.add(new Alumno("Ana", "Rodriguez", "M","5ºF","Multiplataforma"));
               datos.add(new Alumno("Juan", "Merino","H","2ºC","Bachiller"));
               datos.add(new Alumno("Pepe", "Perez","H","1ºA","Bachiller"));
               datos.add(new Alumno("Paco", "Porras","H","2ºA","ESO"));
               datos.add(new Alumno("Manuel", "Antunez", "H", "2ºA","Multiplataforma"));
               datos.add(new Alumno("Ana", "Rodriguez", "M","5ºF","Multiplataforma"));
               datos.add(new Alumno("Juan", "Merino","H","2ºC","Bachiller"));
               datos.add(new Alumno("Pepe", "Perez","H","1ºA","Bachiller"));
               datos.add(new Alumno("Paco", "Porras","H","2ºA","ESO"));
               datos.add(new Alumno("Manuel", "Antunez", "H", "2ºA","Multiplataforma"));
               datos.add(new Alumno("Ana", "Rodriguez", "M","5ºF","Multiplataforma"));
    }
}
