package org.example.colecciones.ejercicio1;

public class Trabajador {

    private String nombre;
    private int edad;

    public Trabajador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        if(!(o instanceof Trabajador)) return false;

        Trabajador t = (Trabajador) o;
        return nombre.equals(t.nombre) && edad==t.edad;
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", edad=" + edad;
    }
}
