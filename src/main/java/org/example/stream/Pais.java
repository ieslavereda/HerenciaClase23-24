package org.example.stream;

import java.util.Comparator;

public class Pais implements Comparable<Pais> {

    public static Comparator<Pais> SORT_BY_POPULATION =
            (p1,p2) -> p1.getPoblacion()-p2.getPoblacion();

    private String nombre;
    private int poblacion;


    public Pais(String nombre, int poblacion) {
        this.nombre = nombre;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
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