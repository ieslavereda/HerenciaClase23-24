package org.example.listas;

import org.example.ejercicio4.Bicicleta;

public class Main {

    public static void main(String[] args) {



        ListaDE<Persona> lista = new ListaDE<>();

        lista.addHead(new Persona("Luis","Garcia"));
        lista.addHead(new Persona("Pedro","Lopez"));
        lista.addHead(new Persona("Carmen","Sanz"));

        //System.out.println(lista);

        System.out.println(lista.removeHead());
        System.out.println(lista.removeHead());
        System.out.println(lista.removeHead());
        System.out.println(lista.removeHead());

    }
}
