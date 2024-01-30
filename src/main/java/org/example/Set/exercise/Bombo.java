package org.example.Set.exercise;

import java.util.*;

public class Bombo {

    private Set<Ball> ballSet;

    public Bombo() {
        ballSet = new LinkedHashSet<>();
    }

    public Bombo(Collection<Ball> bolas) {
        this();
        ballSet.addAll(bolas);
    }

    public void initialize() {
        for (int i = 1; i < 100; i++)
            ballSet.add(new Ball(i));
    }


    public void addBall(Ball bola) {
        ballSet.add(bola);
    }

    public void addBalls(Collection<Ball> bolas) {
        ballSet.addAll(bolas);
    }

    //    public Ball getBall(){
//
//        List<Ball> bolas = new LinkedList<>(ballSet);
//
//        Ball ball = bolas.remove(0);
//
//        ballSet.remove(ball);
//
//        return ball;
//    }
    public Ball getBall() {

        Ball ball = null;

        Iterator<Ball> iterator = ballSet.iterator();

        if(iterator.hasNext()) {
            ball = iterator.next();
            iterator.remove();
        }

        return ball;
    }

    public void shuffle() {

        // Pasar de Set a List

        List<Ball> lista = new ArrayList<>(ballSet);

        Collections.shuffle(lista);

        // Pasar de List a Set
        ballSet.clear();
        ballSet.addAll(lista);
    }

    @Override
    public String toString() {
        return "Bombo{" +
                "ballSet=" + ballSet +
                '}';
    }
}
