package org.example.herencia.ejercicio2;

public class Main {

    public static void main(String[] args) {

        Multimedia m1 = new Pelicula("El señor de los anillos","Tolkien",Formato.dvd,5,"Uno","Otra");
        Multimedia m2 = new Disco("El señor de los anillos","Tolkien",Formato.dvd,5,Genero.opera);

        System.out.println(m1.equals(m2));
        System.out.println(m1);
        System.out.println(m2);

    }
}
