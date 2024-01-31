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

//    public void showEmployeeSortedList(){
//
//        List<Trabajador> list = new ArrayList<>();
//
//        for(Set<Trabajador> set : trabajadores.values()){
//            // list.addAll(set);
//            for(Trabajador t : set)
//                list.add(t);
//        }
//
//        //list.sort((t1,t2)->t1.getNombre().compareTo(t2.getNombre()));
//        list.sort(new Comparator<Trabajador>() {
//            @Override
//            public int compare(Trabajador t1, Trabajador t2) {
//                return t1.getNombre().compareTo(t2.getNombre());
//            }
//        });
//
//        System.out.println(list);
//
//    }

    public void showEmployeeSortedList(){




    }

    @Override
    public String toString() {
        return "Almacen{" +
                "trabajadores=" + trabajadores +
                '}';
    }
}
