package org.example.herencia.ejercicio1;

import java.util.Arrays;

public class Directivo extends Profesor{

    private String cargo;

    public Directivo(String nombre, String apellidos, String DNI, int edad, String cargo, TipoEstudio... imparte) {
        super(nombre, apellidos, DNI, edad, imparte);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public void imprimirDNI() {
        System.out.println("Directivo: " + getDNI());
    }

    @Override
    public String toString() {

        return "Directivo{"+
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", edad=" + getEdad() +
                ", cargo= " + cargo + '\'' +
                ", imparte = " + Arrays.toString(getImparte()) +"}";

    }
}
