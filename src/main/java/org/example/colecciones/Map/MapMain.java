package org.example.colecciones.Map;

import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void main(String[] args) {

        Map<Coche,Persona> coches = new TreeMap<>();

        coches.put(new Coche("5678ABC"),new Persona("Luis","Romero"));
        coches.put(new Coche("1111BBB"),new Persona("Juan","Garcia"));
        coches.put(new Coche("1234BCD"),new Persona("Juan","Garcia"));
        coches.put(new Coche("5678ABC"),new Persona("Luis","Saiz"));

        System.out.println(coches);

        System.out.println(coches.containsKey(new Coche("1111BBB")));
        System.out.println(coches.keySet().contains(new Coche("1111BBB")));



    }
}
