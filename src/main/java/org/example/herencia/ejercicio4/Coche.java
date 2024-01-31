package org.example.herencia.ejercicio4;

public class Coche extends VehiculoMotor{

    private String matricula;


    public Coche(String tipoMotor, int marchas, String matricula) {
        super(tipoMotor, marchas);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public boolean incrementar(int cantidad) {
        if(cantidad<=0) return false;
        if(cantidad>230) return false;

        // setKm_h(Math.min(getKm_h()+cantidad,230));
        setKm_h(getKm_h()+cantidad);

        if(getKm_h()>230)
            setKm_h(230);

        return true;
    }

    @Override
    public boolean decrementar(int cantidad) {
        if(cantidad<=0) return false;
        //if(cantidad>230) return false;

        setKm_h(getKm_h()-cantidad);
        if(getKm_h()<0)
            setKm_h(0);

        return true;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"+
                "matricula='" + matricula + '\'';
    }
}
