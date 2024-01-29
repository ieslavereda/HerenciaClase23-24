package org.example.Set;

import java.util.Comparator;

public class Persona implements Comparable<Persona> {

    public static Comparator<Persona> SORT_BY_AGE = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return p1.edad-p2.edad;
        }
    };

    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos,int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad=edad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(!(obj instanceof Persona)) return false;

        Persona p = (Persona) obj;

        return nombre.equals(p.nombre) &&
                apellidos.equals(p.apellidos) &&
                edad==p.edad;
    }

    @Override
    public int hashCode() {
        return apellidos.hashCode();
    }

    @Override
    public String toString() {
        return "{nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos +"'"+
                ", edad= " + edad+"}";
    }

    @Override
    public int compareTo(Persona o) {
        if(apellidos.equals(o.apellidos))
            return nombre.compareTo(o.nombre);

        return apellidos.compareTo(o.apellidos);
    }
}
