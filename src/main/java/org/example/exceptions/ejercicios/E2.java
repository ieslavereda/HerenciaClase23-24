package org.example.exceptions.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {


        double[] valores = new double[5];



        for(int i=0;i<valores.length;i++) {
            addValue(valores,i);
        }

        System.out.println(Arrays.toString(valores));

    }

    private static void addValue(double[] valores, int i) {
        double aux;
        boolean valorCorrecto;


        valorCorrecto = false;
        do {
            try {

                valores[i] = getValue("Introduce el valor para la posicion " + i);
                valorCorrecto = true;

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        } while (!valorCorrecto);
    }

    public static double getValue(String message) throws Exception {
        Scanner sc  = new Scanner(System.in);
        System.out.println(message);
        if(!sc.hasNextDouble())
            throw new Exception("No has introducido un decimal");
        else
            return  sc.nextDouble();
    }

}
