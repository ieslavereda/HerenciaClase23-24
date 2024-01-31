package org.example.colecciones.Set;

import java.util.*;

public class SetMain {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Joaquin","Gimenez",30));
        personas.add(new Persona("Manuel","Saez",45));
        personas.add(new Persona("Carmen","Lopez",44));
        personas.add(new Persona("Silvia","Gonzalez",67));

        personas.add(new Persona("Joaquin","Gimenez",30));
        personas.add(new Persona("Manuel","Saez",45));
        personas.add(new Persona("Carmen","Lopez",44));
        personas.add(new Persona("Silvia","Gonzalez",67));


        Collections.sort(personas,Persona.SORT_BY_AGE);

        for(Persona persona : personas)
            System.out.println(persona);


//        personas.remove(new Persona("Joaquin","Gimenez",30));
//
//
//        Iterator<Persona> iterator = personas.iterator();
//
//        while (iterator.hasNext()){
//
//            Persona p = iterator.next();
//            if(p.getEdad()%2==0)
//                iterator.remove();
//
//        }

        Set<Persona> personas2 = new TreeSet<>(personas);

//        for(Persona persona : personas2)
//            System.out.println(persona);

//        Set<Persona> personas3 = new TreeSet<>(Persona.SORT_BY_AGE);
//
//        personas3.addAll(personas2);
//
//        for(Persona persona : personas3)
//            System.out.println(persona);

    }
}
