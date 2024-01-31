package org.example.colecciones.Set.exercise;

public class Ball implements Comparable<Ball> {

    private int numero;

    public Ball(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int hashCode(){
        return numero;
    }

    @Override
    public boolean equals(Object o){
        if(o == null) return false;
        if(!(o instanceof Ball)) return false;

        Ball ball = (Ball) o;

        return ball.numero == numero;
    }

    @Override
    public String toString() {
        return  String.valueOf(numero) ;
    }


    @Override
    public int compareTo(Ball ball) {
        return numero-ball.numero;
    }
}
