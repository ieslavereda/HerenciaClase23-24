package org.example.colecciones.ejercicio1;

import java.util.*;

public class Almacen {

    Map<Pais, Set<Trabajador>> trabajadores;

    public Almacen() {
        trabajadores = new TreeMap<>();
    }

    public void addEmploye(Trabajador t,Pais p){

        if(trabajadores.containsKey(p)){
            trabajadores.get(p).add(t);
        } else {
            Set<Trabajador> set = new HashSet<>();
            set.add(t);
            trabajadores.put(p,set);
        }


    }

    public void showSortedCountriesList(){

        List<Pais> paisList = new ArrayList<>(trabajadores.keySet());

        Collections.sort(paisList);

        System.out.println(paisList);

    }

    @Override
    public String toString() {
        return "Almacen{" +
                "trabajadores=" + trabajadores +
                '}';
    }
}
