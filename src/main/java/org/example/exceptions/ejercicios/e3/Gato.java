package org.example.exceptions.ejercicios.e3;

public class Gato {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        checkName(nombre);
        checkAge(edad);

        this.nombre = nombre;
        this.edad = edad;
    }

    public void checkName(String nombre) throws Exception {
        if(nombre.length()<3)
            throw new Exception("El nombre debe tener al menos 3 caracteres");
    }
    public void checkAge(int edad) throws Exception {
        if(edad<0)
            throw new Exception("La edad no puede ser negativa");
    }

    public void setNombre(String nombre) throws Exception {
        checkName(nombre);
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        checkAge(edad);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
