package org.example.ficheros.e1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Gato implements Serializable {

    private String nombre;
    private int edad;

    public Gato(String nombre, int edad) throws Exception {
        checkName(nombre);
        checkAge(edad);

        this.nombre = nombre;
        this.edad = edad;
    }

    //    public static void save(List<Gato> list, String filename){
//
//        try(ObjectOutputStream oos = new ObjectOutputStream(
//                new FileOutputStream(filename))){
//
//            oos.writeObject(list);
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
    public static void save(List<Gato> list, String filename) {

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(filename))) {

            for (Gato g : list)
                oos.writeObject(g);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

//    public static List<Gato> load(String filename){
//
//        try(ObjectInputStream ois = new ObjectInputStream(
//                new FileInputStream(filename))){
//
//
//            List<Gato> gatoList = (List<Gato>) ois.readObject();
//
//            return gatoList;
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    public static List<Gato> load(String filename) {
        List<Gato> gatoList = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(filename))) {

            Gato gato;

            while ((gato = (Gato) ois.readObject()) != null)
                gatoList.add(gato);

        } catch (Exception e) {

        }  finally {
            return gatoList;
        }

    }


    public void checkName(String nombre) throws Exception {
        if (nombre.length() < 3)
            throw new Exception("El nombre debe tener al menos 3 caracteres");
    }

    public void checkAge(int edad) throws Exception {
        if (edad < 0)
            throw new Exception("La edad no puede ser negativa");
    }

    public void setNombre(String nombre) throws Exception {
        checkName(nombre);
        this.nombre = nombre;
    }

    public void setEdad(int edad) throws Exception {
        checkAge(edad);
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
