package org.example.herencia.ejercicio1;

public class Persona {

    private String nombre;
    private String apellidos;
    private String DNI;
    private int edad;

    public Persona(String nombre, String apellidos, String DNI, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void cumplirAnyos(){
        edad++;
    }

    public void imprimirDNI(){
        System.out.println("Persona: " + DNI);
    }

    @Override
    public boolean equals(Object obj) {

        if(obj == null) return false;

        if(!(obj instanceof Persona)) return false;

        Persona p = (Persona) obj;

        return p.DNI == DNI &&
                p.nombre.equals(nombre) &&
                p.apellidos.equals(apellidos);


    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", edad=" + edad +
                '}';
    }
}
