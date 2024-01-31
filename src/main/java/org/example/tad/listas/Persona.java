package org.example.tad.listas;

public class Persona {

    private String nombre;
    private String apellidos;


    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }



    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(!(obj instanceof Persona)) return false;

        Persona p = (Persona) obj;

        return nombre.equals(p.nombre) && apellidos.equals(p.apellidos);
    }

    @Override
    public String toString() {
        return "{nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos +"'}";

    }
}
