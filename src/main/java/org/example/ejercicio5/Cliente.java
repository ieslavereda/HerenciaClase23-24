package org.example.ejercicio5;

public class Cliente extends Persona{

    private int idCliente;

    public Cliente(String nombre, String apellidos, String DNI, String dirección,int idCliente) {
        super(nombre, apellidos, DNI, dirección);
        this.idCliente=idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
