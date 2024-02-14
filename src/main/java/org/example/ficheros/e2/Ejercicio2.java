package org.example.ficheros.e2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("Documentos/numeros.txt"))){
            String linea="";
            while((linea=br.readLine())!=null){
                integerList.add(Integer.parseInt(linea));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int max = integerList.stream()
                .max((o1, o2) -> o1-o2)
                .get();
        int min = integerList.stream()
                .min((o1, o2) -> o1-o2)
                .get();

        System.out.println("Maximo: " + max + ", Minimo: " + min);

    }
}
