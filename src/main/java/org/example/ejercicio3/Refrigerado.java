package org.example.ejercicio3;

import java.time.LocalDate;

public class Refrigerado extends Producto{

    private long codigoSupervisionAlimentaria;

    public Refrigerado(LocalDate caducidad, long lote, String informacion, long codigoSupervisionAlimentaria) {
        super(caducidad, lote, informacion);
        this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
    }

    public long getCodigoSupervisionAlimentaria() {
        return codigoSupervisionAlimentaria;
    }

    public void setCodigoSupervisionAlimentaria(long codigoSupervisionAlimentaria) {
        this.codigoSupervisionAlimentaria = codigoSupervisionAlimentaria;
    }

    @Override
    public void imprimirInformacion() {
        System.out.println("Refrigerado: " + getInformacion());
    }
}
