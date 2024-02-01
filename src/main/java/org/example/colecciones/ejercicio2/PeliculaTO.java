package org.example.colecciones.ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PeliculaTO implements Comparable<PeliculaTO>{

    private int id;

    private String titulo;

    private List<String> actores;

    private List<String> directores;



    public PeliculaTO(int id, String titulo) {

        this.id = id;
        this.titulo = titulo;

        actores = new ArrayList<String>();

        directores = new ArrayList<String>();

    }



    public List<String> getActores() {

        return actores;

    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getDirectores() {
        return new LinkedList<>(directores);
    }

    public void addActor(String actor) {

        actores.add(actor);

    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(!(obj instanceof PeliculaTO)) return false;

        PeliculaTO pelicula = (PeliculaTO) obj;

        return id==pelicula.getId();
    }

    @Override
    public String toString() {
        return "Id: " + id+", Titulo: " + titulo + ", Actores: " +actores;
    }

    @Override
    public int compareTo(PeliculaTO o) {
        return titulo.compareTo(o.titulo);
    }
}