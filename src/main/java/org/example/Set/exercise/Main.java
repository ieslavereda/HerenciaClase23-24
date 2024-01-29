package org.example.Set.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Bombo bombo = new Bombo();
        bombo.initialize();
        bombo.shuffle();

//        bombo.addBall(new Ball(5));
//        bombo.addBall(new Ball(15));
//        bombo.addBall(new Ball(5));

        System.out.println(bombo);
        System.out.println(bombo.getBall());
        System.out.println(bombo);

    }
}
