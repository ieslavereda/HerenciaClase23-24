package org.example.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {

        List<Pais> paises = List.of(
             new Pais("España",47420000),
                new Pais("Francia",67750000),
                new Pais("Alemania",83200000),
                new Pais("Portugal",10330000),
                new Pais("Belgica",11590000),
                new Pais("Rumania",19120000)

        );

        System.out.println(
                paises.stream()
                .sorted(Pais.SORT_BY_POPULATION.reversed())
                        // Comparator.comparingInt(Pais::getPoblacion)

                .map( p -> p.getNombre())
                .collect(Collectors.joining(",", "Paises: ", ".")));

        System.out.println(
                paises.stream()
                        .filter( p -> p.getPoblacion()>20_000_000)
                        .filter( p -> p.getNombre().charAt(0)!='A' &&
                                p.getNombre().charAt(0)!='I' &&
                                p.getNombre().charAt(0)!='O' &&
                                p.getNombre().charAt(0)!='U' &&
                                p.getNombre().charAt(0)!='E')
                        .map(p -> p.getNombre())
                        .collect(Collectors.joining(",","Paises: ","."))
        );

        Optional<Pais> optional = paises.stream()
                .filter(p->p.getPoblacion()<10_000_000)
                .findFirst();

        if(optional.isPresent())
            System.out.println("Pais: " + optional.get().getNombre());
        else
            System.out.println("No hay ninguno");


    }
}
