package org.example.ejercicio3;

import java.time.LocalDate;
import java.util.spi.LocaleNameProvider;

public abstract class Producto {

    private LocalDate caducidad;
    private long lote;
    private String informacion;

    public Producto(LocalDate caducidad, long lote, String informacion) {
        this.caducidad = caducidad;
        this.lote = lote;
        this.informacion = informacion;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public long getLote() {
        return lote;
    }

    public String getInformacion() {
        return informacion;
    }

    public abstract void imprimirInformacion();

    @Override
    public String toString() {
        return "Producto{" +
                "caducidad=" + caducidad +
                ", lote=" + lote +
                ", informacion='" + informacion + '\'' +
                '}';
    }
}
