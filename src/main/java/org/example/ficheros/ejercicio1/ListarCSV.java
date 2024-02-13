package org.example.ficheros.ejercicio1;

import java.io.*;
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

        personaList.add(new Persona(
                "Juan","Lopez","j.lopez@edu.gva.es"
        ));


        guardar(personaList);
    }

    private static void guardar(List<Persona> personaList) {

        try(PrintWriter pw = new PrintWriter(new FileWriter("nuevo.csv"))){

            for(Persona p : personaList)
                pw.println(p.getNombre()+";"+p.getApellidos()+";"+p.getEmail());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
