package org.example.listas;

import org.example.ejercicio4.Bicicleta;

public class Main {

    public static void main(String[] args) {



        Lista<Persona> lista = new Lista<>();

        Persona p = new Persona("Luis","Garcia");
        lista.addHead(p);
        lista.addHead(new Persona("Pedro","Lopez"));
        lista.addHead(new Persona("Carmen","Sanz"));

        System.out.println(lista);

//        System.out.println(lista.contains(new Persona("Luis","Garcia")));

        for(Persona persona : lista.getAsArray(Persona.class))
            System.out.println(persona);

    }
}
