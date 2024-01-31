package org.example.tad.listas;

public class Main {

    public static void main(String[] args) {



        ListaSE<Persona> lista = new ListaSE<>();

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
