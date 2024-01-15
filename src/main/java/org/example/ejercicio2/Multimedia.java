package org.example.ejercicio2;

public class Multimedia {


    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;


    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Multimedia)) return false;

        Multimedia m = (Multimedia) obj;

        return m.autor.equals(autor) && m.titulo.equals(titulo);
    }

    @Override
    public String toString() {
        return "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", duracion=" + duracion;
    }
}
