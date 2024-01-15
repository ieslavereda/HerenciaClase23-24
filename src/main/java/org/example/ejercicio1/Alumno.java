package org.example.ejercicio1;

public class Alumno extends Persona{

    private String NIA;
    private TipoEstudio tipoEstudio;


    public Alumno(String nombre, String apellidos, String DNI, int edad, String NIA, TipoEstudio tipoEstudio) {
        super(nombre, apellidos, DNI, edad);
        this.NIA = NIA;
        this.tipoEstudio = tipoEstudio;
    }

    public Alumno(String nombre, String apellidos, String DNI, int edad, TipoEstudio tipoEstudio) {
        super(nombre, apellidos, DNI, edad);
        this.tipoEstudio=tipoEstudio;
        this.NIA = obtenerNiaAleatorio();
    }

    private String obtenerNiaAleatorio() {

        String NIA = "";

        for(int i=0;i<8;i++)
            NIA+=String.valueOf((int)(Math.random()*10));

        return NIA;
    }

    @Override
    public void imprimirDNI() {
        System.out.println("Alumno: " + getDNI());
    }

    @Override
    public String toString() {
        return "Alumno{"+
                "nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", edad=" + getEdad() +
                ", NIA=" + NIA +'\'' +
                ", TipoEstudio= " + tipoEstudio+"}";
    }
}
