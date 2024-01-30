package org.example.Set.exercise;

import java.util.*;

public class Soporte {

    private Set<Ball> ballSet;

    public Soporte() {
        ballSet = new LinkedHashSet<>();
    }

    public void add(Ball ball) {
        ballSet.add(ball);
    }

    public boolean check(Ball ball) {
        return ballSet.contains(ball);
    }

    public boolean check(Collection<Ball> balls) {
        return ballSet.containsAll(balls);
    }

    public List<Ball> getList() {
        return new ArrayList<>(ballSet);
    }

//    public List<Ball> getSortedList(){
//
//        List<Ball> list = new ArrayList<>(ballSet);
//
//        list.sort(new Comparator<Ball>() {
//            @Override
//            public int compare(Ball o1, Ball o2) {
//                return o1.getNumero()-o2.getNumero();
//            }
//        });
//
//        return list;
//    }

//    public List<Ball> getSortedList(){
//
//        return new ArrayList<>(new TreeSet<>(ballSet));
//
//    }

//    public List<Ball> getSortedList(){
//
//        Set<Ball> set = new TreeSet<>(new Comparator<Ball>() {
//            @Override
//            public int compare(Ball o1, Ball o2) {
//                return o1.getNumero()-o2.getNumero();
//            }
//        });
//
//        set.addAll(ballSet);
//
//        return new ArrayList<>(set);
//    }

//    public List<Ball> getSortedList() {
//
//        List<Ball> lista = new LinkedList<>(ballSet);
//        Collections.sort(lista);
//
//        return lista;
//    }

    public List<Ball> getSortedList() {

        List<Ball> lista = new LinkedList<>(ballSet);

        Collections.sort(lista, (o1, o2) ->  o1.getNumero()-o2.getNumero());

        return lista;
    }
}












