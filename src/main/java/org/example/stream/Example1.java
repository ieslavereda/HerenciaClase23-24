package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {

        List<String> names = List.of(
                "Toni",
                "Carlos",
                "Juan",
                "Antonio",
                "Teresa",
                "Ana",
                "Iris",
                "Elena"
                );

        String texto = names.stream()
                .peek((s) -> System.out.println("Antes: " + s))
                .filter((s) ->s.charAt(0)!='A' && s.charAt(0)!='E' && s.charAt(0)!='I'&& s.charAt(0)!='O'&& s.charAt(0)!='U')
                .peek((s) -> System.out.println("Despues: " + s))
                .sorted()
                .collect(Collectors.joining(",","Names: ","."));


        System.out.println(texto);
    }
}
