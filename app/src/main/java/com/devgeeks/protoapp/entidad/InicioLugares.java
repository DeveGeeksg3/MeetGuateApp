package com.devgeeks.protoapp.entidad;

/**
 * Created by Android on 2/28/2018.
 */

public class InicioLugares {
    public int imagen;
    public String nombre;
    public String descripcion;
    public String lugar;

    public InicioLugares(int imagen, String nombre, String descripcion, String lugar){

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.imagen = imagen;

    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "InicioLugares{" +
                "imagen=" + imagen +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}
