package org.example.herencia.ejercicio4;

public class Bicicleta extends Vehiculo{

    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean incrementar(int cantidad) {

        if(cantidad<=0) return false;
        if(cantidad>4){
            setKm_h(getKm_h()+4);
            return true;
        }

        setKm_h(getKm_h()+cantidad);

        return true;
    }

    @Override
    public boolean decrementar(int cantidad) {
        if(getKm_h()==0) return false;
        if(cantidad<=0) return false;
        if(cantidad>4){
            setKm_h(getKm_h()-4);
        }

        setKm_h(getKm_h()-cantidad);

        if(getKm_h()<0) setKm_h(0);

        return true;
    }
}
