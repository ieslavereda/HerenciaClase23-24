package org.example.herencia.ejercicio3;

import java.time.LocalDate;

public class Fresco extends Producto{

    private LocalDate fechaEnvasado;
    private String paisOrigen;

    public Fresco(LocalDate caducidad, long lote, String informacion, LocalDate fechaEnvasado, String paisOrigen) {
        super(caducidad, lote, informacion);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Fresco: " +getInformacion());
    }
}
