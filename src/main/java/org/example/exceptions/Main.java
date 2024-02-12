package org.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer n1 = null, n2 = null;

        Scanner sc = new Scanner(System.in);
        boolean operacionRealizada = false;

        do {

            try {

                n1 = sc.nextInt();
                n2 = sc.nextInt();

                System.out.println(n1 + "/" + n2 + " = " + Operacion.division(n1, n2));

                operacionRealizada = true;

            } catch (InputMismatchException ie) {

                System.out.println("No has introducido un numero");

            } catch (Exception e) {
                System.out.println("Erro de division por cero");
            } finally {
                System.out.println("Esto siempre se ejecuta");
            }

        } while (!operacionRealizada);

    }
}
