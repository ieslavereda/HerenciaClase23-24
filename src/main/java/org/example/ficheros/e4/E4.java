package org.example.ficheros.e4;


import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class E4 {

    public static void main(String[] args) {

        int numPersonas=10;

        try {

            List<String> nombres = readFile("Documentos/usa_nombres.txt");
            List<String> apellidos = readFile("Documentos/usa_apellidos.txt");

            String persona;

            for(int i=0;i<numPersonas;i++)
                saveLine(generarPersonaAleatoria(nombres, apellidos),"Documentos/usa_personas.txt");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void saveLine(String line, String file) throws IOException {

        try(PrintWriter pw = new PrintWriter(
                new FileWriter(file,true))){

            pw.println(line);

        }
    }


    private static String generarPersonaAleatoria(List<String> nombres, List<String> apellidos) {
        Collections.shuffle(nombres);
        Collections.shuffle(apellidos);

        return nombres.get(0) + " " + apellidos.get(0);
    }


    private static List<String> readFile(String file) throws IOException {
        try(BufferedReader br = new BufferedReader(
                new FileReader(file))) {

            return br.lines()
                    .collect(Collectors.toList());
        }
    }
}
