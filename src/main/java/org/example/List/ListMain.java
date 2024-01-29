package org.example.List;

import java.util.*;

public class ListMain {

    public static void main(String[] args) {

        List<Persona> lista = new LinkedList<>();
        //List<Persona> lista2;

        lista.add(new Persona("Juan","Garcia"));
        lista.add(new Persona("Tomas","Lopez"));
        lista.add(new Persona("Sergio","Gutierrez"));
        lista.add(new Persona("Juan","Sanz"));
        lista.add(new Persona("Carmen","Martinez"));

//
//        Iterator<Persona> iterator = lista.iterator();
//
//        while(iterator.hasNext()){
//
//            Persona p = iterator.next();
//
//            if(p.getApellidos().startsWith("G"))
//                iterator.remove();
//            else
//                System.out.println(p);
//        }

//        lista.sort(Comparator.comparing(Persona::getApellidos));



        System.out.println(lista);

//        for(Persona p : lista)
//            System.out.println(p);

//        for(Persona p : lista)
//            if(p.getApellidos().startsWith("G"))
//                lista.remove(p);
//            else
//                System.out.println(p);

    }
}
