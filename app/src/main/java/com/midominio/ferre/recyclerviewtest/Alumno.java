package com.midominio.ferre.recyclerviewtest;

/**
 * Created by JosePablo on 09/10/2017.
 */

public class Alumno
{
    private String nombre;
    private String apellidos;
    private String sexo;
    private String clase;
    private String nivel;

    public Alumno(String nom, String apell, String sex, String cla, String niv){
        nombre = nom;
        apellidos = apell;
        sexo = sex;
        clase = cla;
        nivel = niv;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){ return apellidos; }

    public String getSexo(){
        return sexo;
    }

    public String getClase(){
        return clase;
    }

    public String getNivel(){
        return nivel;
    }

    public void setNombre(String name) {
        nombre += name;
    }

}