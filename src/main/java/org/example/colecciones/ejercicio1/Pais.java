package org.example.colecciones.ejercicio1;

public class Pais implements Comparable<Pais> {

    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  "'"+nombre+"'";
    }

    @Override
    public int compareTo(Pais pais) {
        return nombre.compareTo(pais.nombre);
    }
}
