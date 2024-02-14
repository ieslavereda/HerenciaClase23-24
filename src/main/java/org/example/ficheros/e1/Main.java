package org.example.ficheros.e1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//
//        List<Gato> gatoList = new ArrayList<>();
//
//        try{
//
//            gatoList.add(new Gato("Luna",7));
//            gatoList.add(new Gato("Thor",3));
//            gatoList.add(new Gato("Sol",2));
//            gatoList.add(new Gato("Manchitas",4));
//            gatoList.add(new Gato("Pardo",1));
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        Gato.save(gatoList,"misgatos");

        System.out.println(Gato.load("misgatos"));

    }
}
