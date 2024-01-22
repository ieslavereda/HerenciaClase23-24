package org.example.listas;

public class Main {

    public static void main(String[] args) {


        Lista lista = new Lista();


        lista.addHead(6);
        lista.addHead(8);
        lista.addHead(45);
        lista.addTail(0);
        lista.addTail(1);


        System.out.println(lista);
        System.out.println(lista.remove(5));
        System.out.println(lista);

    }
}
