package org.example.colecciones.ejercicio1;

import java.util.*;
import java.util.stream.Collectors;

public class Almacen {

    Map<Pais, Set<Trabajador>> trabajadores;

    public Almacen() {
        trabajadores = new TreeMap<>();
    }

    public void addEmploye(Trabajador t, Pais p) {

        if (trabajadores.containsKey(p)) {
            trabajadores.get(p).add(t);
        } else {
            Set<Trabajador> set = new TreeSet<>();
            set.add(t);
            trabajadores.put(p, set);
        }


    }

    public void showSortedCountriesList() {

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

    public void showEmployeeSortedList() {

        Set<Trabajador> trabajadorSet = new TreeSet<>();

        for (Set<Trabajador> set : trabajadores.values())
            trabajadorSet.addAll(set);

        System.out.println(trabajadorSet);

    }

    //    public void showCountryEmployeeList(){
//
//        for(Pais pais : trabajadores.keySet()){
//
//            System.out.println(pais);
//
//            List<Trabajador> list = new ArrayList<>(trabajadores.get(pais));
//
//            list.sort((t1,t2)->t1.getEdad()-t2.getEdad());
//
//            System.out.println(list);
//        }
//
//    }

    public void showCountryEmployeeList() {

        Map<Pais, Set<Trabajador>> aux = new TreeMap<>();

        for (Pais pais : trabajadores.keySet()) {
            Set<Trabajador> set = new TreeSet<>((t1, t2) -> t1.getEdad() - t2.getEdad());
            set.addAll(trabajadores.get(pais));
            aux.put(pais, set);
        }

        System.out.println(aux);

    }

    public void showEmployeeMoreThan50() {

        List<Trabajador> trabajadorList = new ArrayList<>();
        for(Set<Trabajador> set : trabajadores.values())
            trabajadorList.addAll(set);
        Iterator<Trabajador> iterator = trabajadorList.iterator();
        while (iterator.hasNext()){
            Trabajador t= iterator.next();
            if(t.getEdad()<=50)
                iterator.remove();

        }
        Collections.sort(trabajadorList);

        System.out.println(trabajadorList);

    }
    public void showEmployeeMoreThan50Streams() {

        System.out.println(
                trabajadores.values().stream()
                        .flatMap(set -> set.stream())
                        .filter(t -> t.getEdad() > 50)
                        .sorted()
                        .collect(Collectors.toList())
        );

    }

    @Override
    public String toString() {
        return "Almacen{" +
                "trabajadores=" + trabajadores +
                '}';
    }
}
