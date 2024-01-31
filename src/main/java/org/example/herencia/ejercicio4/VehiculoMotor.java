package org.example.herencia.ejercicio4;

public abstract class VehiculoMotor extends Vehiculo {

    private String tipoMotor;
    private int marchas;

    public VehiculoMotor(String tipoMotor, int marchas) {
        this.tipoMotor = tipoMotor;
        this.marchas = marchas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"+
                "tipoMotor: '" + tipoMotor + '\n' +
                "marchas=" + marchas ;
    }
}
