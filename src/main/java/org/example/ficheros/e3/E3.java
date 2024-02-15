package org.example.ficheros.e3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class E3 {

    public static void main(String[] args) {


        readFile("Documentos/alumnos_notas.txt")
                .stream()
                .sorted(Comparator.comparingDouble(Alumno::getAverage).reversed())
                .map(p -> p.name+" "+p.apellidos+ " -> " + p.getAverage())
                .forEach(System.out::println);

    }

    public static List<Alumno> readFile(String file){

        List<Alumno> list = new ArrayList<>();


        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            br.lines()
                    .map(linea -> new ArrayList<>(Arrays.asList(linea.split(" "))))
                    .forEach(datos -> list.add(new Alumno(datos.remove(0),datos.remove(0), datos)));

        }catch (Exception e){
            e.printStackTrace();
        }

        return list;

    }

    private static class Alumno {

        String name;
        String apellidos;
        List<Integer> notas;

        public Alumno(String name, String apellidos, List<String> list) {
            this.name = name;
            this.apellidos = apellidos;
            notas=list.stream()
                    .map(nota -> Integer.parseInt(nota))
                    .collect(Collectors.toList());
        }

        public double getAverage(){
            return notas.stream().mapToInt(n->n).average().getAsDouble();
        }

    }
}
