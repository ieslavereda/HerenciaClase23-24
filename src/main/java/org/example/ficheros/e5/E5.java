package org.example.ficheros.e5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class E5 {

    public static void main(String[] args) {


        try {
            List<String> lineas = getLines("Documentos/Libros/lazarillo.txt");

            System.out.println("Lineas: " + lineas.size());
            System.out.println("Characters: " + countCharacters(lineas));

            Map<String ,Integer> map = getMapCountWords(lineas);

            for(String word : getSortedWords(map,10))
                System.out.println(word);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static long countCharacters(List<String> lineas) {
//        long cantidad=0;
//
//        for(String linea : lineas)
//            cantidad+=linea.length();
//
//        return cantidad;

        return lineas.stream()
                .mapToInt(l -> l.length())
                .sum();

    }

    private static List<String> getSortedWords(Map<String, Integer> mapCountWords,int cantidad){
//        List<String> words = new ArrayList<>(mapCountWords.keySet());
//        Collections.sort(words, (o1, o2) -> mapCountWords.get(o2)-mapCountWords.get(o1));
//        return words;

        return mapCountWords.keySet()
                .stream()
                .filter(w -> w.length()>4)
                .sorted((o1, o2) -> mapCountWords.get(o2)-mapCountWords.get(o1))
                .limit(cantidad)
                .map(w -> w + " -> " +mapCountWords.get(w))
                .collect(Collectors.toList());

    }

    private static Map<String, Integer> getMapCountWords(List<String> lineas) {

        Map<String, Integer> mapCountWords = new HashMap<>();

        for (String linea : lineas) {

            linea = linea.replaceAll("[\"0123456789=&%,;:.]", "");

            for (String word : linea.split(" ")) {
                if (!word.isEmpty())
                    if (!mapCountWords.containsKey(word))
                        mapCountWords.put(word, 1);
                    else
                        mapCountWords.put(word, mapCountWords.get(word) + 1);

            }

        }

        return mapCountWords;
    }

    private static List<String> getLines(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            return br.lines().collect(Collectors.toList());

        }
    }
}
