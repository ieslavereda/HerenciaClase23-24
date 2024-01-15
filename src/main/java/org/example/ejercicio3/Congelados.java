package org.example.ejercicio3;

import java.time.LocalDate;

public class Congelados extends Producto{

    private int temperaturaRecomendada;

    public Congelados(LocalDate caducidad, long lote, String informacion, int temperaturaRecomendada) {
        super(caducidad, lote, informacion);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }



    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Congelados: " + getInformacion());
    }
}
