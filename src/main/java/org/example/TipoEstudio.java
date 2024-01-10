package org.example;

public enum TipoEstudio {

    DAM_1(1,"DAM"),
    DAM_2(2,"DAM"),
    DAW_1(1,"DAW"),
    DAW_2(2,"DAW"),
    ASIR_1(1,"ASIR"),
    ASIR_2(2,"ASIR");

    private int curso;
    private String nombre;

    TipoEstudio(int curso,String nombre) {
        this.curso = curso;
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return curso +"º " + nombre;
    }
}
