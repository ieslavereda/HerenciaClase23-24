package org.example.exceptions.ejercicios.e3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>();
        String nombre="";
        int edad;

        for(;gatos.size()<5;){

            try{

                nombre = getString("Introduce el nombre para el gato " + (gatos.size()+1));
                edad = Integer.parseInt(getString("Introduce la edad para el gato " + (gatos.size()+1)));

                gatos.add(new Gato(nombre,edad));

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

        System.out.println(gatos);


    }

    private static String getString(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
