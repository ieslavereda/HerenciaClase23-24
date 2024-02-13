package org.example.ficheros;

import org.example.ficheros.ejercicio1.Persona;

import java.io.*;

public class CopyObjects {

    public static void main(String[] args) {

//        Persona persona = new Persona("Joaquin","Alonso","jv.alonso@edu.gva.es");
//
//        try(ObjectOutputStream oos = new ObjectOutputStream(
//                new FileOutputStream("objecfile")))
//        {
//
//            oos.writeObject(persona);
//            oos.flush();
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


        cargarDatos();

    }

    private static void cargarDatos() {

        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("objecfile")))
        {

            Persona p = (Persona) ois.readObject();

            System.out.println(p);

        } catch (Exception e) {
            System.out.println("Se ha producido el error: " + e.getMessage());
        }

    }

}
