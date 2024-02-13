package org.example.ficheros.ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListarCSV {

    public static void main(String[] args) {

        List<Persona> personaList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(
                new FileReader("datos.csv")))
        {

            String linea;

            while ((linea=br.readLine())!=null){
                String[] datos = linea.split(";");
                personaList.add(
                        new Persona(datos[0],datos[1],datos[2])
                );
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println(personaList);

    }


}
