package org.example.Set.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Bombo bombo = new Bombo();
        Soporte soporte= new Soporte();

        bombo.initialize();
        bombo.shuffle();

        System.out.println(bombo);

        for(int i=0;i<10;i++)
            soporte.add(bombo.getBall());

        System.out.println(soporte.getList());
        System.out.println(soporte.getSortedList());

    }
}
