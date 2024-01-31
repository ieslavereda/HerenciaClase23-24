package org.example.colecciones.Map;

public class Persona {

    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }


    @Override
    public String toString() {
        return "'" + nombre + ' ' +
                apellidos +"'";
    }
}
