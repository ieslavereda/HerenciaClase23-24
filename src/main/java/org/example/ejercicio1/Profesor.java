package org.example.ejercicio1;

import java.util.Arrays;

public class Profesor extends Persona {


    private TipoEstudio[] imparte;

    public Profesor(String nombre, String apellidos, String DNI, int edad, TipoEstudio... imparte) {
        super(nombre, apellidos, DNI, edad);

        this.imparte = imparte;
    }


    public TipoEstudio[] getImparte() {
        return imparte;
    }

    public void setImparte(TipoEstudio... imparte) {
        this.imparte = imparte;
    }

    @Override
    public void imprimirDNI() {
        System.out.println("Profesor: " + getDNI());
    }

    @Override
    public String toString() {

        return "Profesor{"+
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", edad=" + getEdad() +
                ", imparte = " + Arrays.toString(imparte) +"}";

    }
}
