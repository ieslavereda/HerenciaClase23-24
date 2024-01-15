package org.example.ejercicio2;

public class Pelicula extends Multimedia {

    private static final String ANIMACION = "Animación";

    private String actor;
    private String actriz;

    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);

        if (actor == null && actor == null) {
            this.actor = ANIMACION;
            this.actriz = ANIMACION;
        } else {
            this.actor = actor;
            this.actriz = actriz;
        }
    }

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString() {

        return "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", formato=" + getFormato() +
                ", duracion=" + getDuracion()+
                ", actor= " + actor +
                ", actriz= " + actriz;
       // return super.toString() + ", actor= " + actor + ", actriz= " + actriz;
    }
}
