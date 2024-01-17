package org.example.ejercicio5;

public abstract class Persona {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String dirección;

    public Persona(String nombre, String apellidos, String DNI, String dirección) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.dirección = dirección;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
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

    @Override
    public boolean equals(Object o){
        if(o==null) return false;
        if(!(o instanceof Persona)) return false;

        Persona p =(Persona) o;

        return p.DNI.equals(DNI);
    }
}
