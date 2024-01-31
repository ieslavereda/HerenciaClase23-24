package org.example.herencia.ejercicio4;

public abstract class Vehiculo {

    private int km_h;

    public Vehiculo() {
        km_h=0;
    }

    public int getKm_h() {
        return km_h;
    }

    public void setKm_h(int km_h) {
        this.km_h = km_h;
    }

    public void incrementar(){
        km_h++;
    }

    public void decrementar(){
        km_h--;
    }

    public abstract boolean incrementar(int cantidad);
    public abstract boolean decrementar(int cantidad);

    @Override
    public String toString() {
        return "Velocidad: " + km_h + " km/h";
    }
}
