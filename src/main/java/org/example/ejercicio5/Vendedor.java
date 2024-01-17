package org.example.ejercicio5;

import java.util.Arrays;

public class Vendedor extends Empleado{

    private Coche coche;
    private String telefono;
    private String area;
    private Cliente[] clientes;
    private float comision;

    public Vendedor(String nombre, String apellidos, String DNI, String dirección, String telefono, float salario, Coche coche, String telefono1, String area, float comision, Cliente... clientes) {
        super(nombre, apellidos, DNI, dirección, telefono, salario);
        this.coche = coche;
        this.telefono = telefono1;
        this.area = area;
        this.clientes = clientes;
        this.comision = comision;
    }

    public void addClient(Cliente cliente){
        clientes = add(cliente,clientes);
    }

    public void eliminarCliente(Cliente cliente){
        clientes = remove(cliente);
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {

        if(empleado instanceof Vendedor || empleado instanceof JefeZona)
            supervisor=empleado;

    }

    @Override
    public void incrementarSalario() {
        salario*=1.1;
    }

    private Cliente[] add(Cliente coordinate, Cliente[] array){

        if(coordinate==null) return array;

        Cliente[] aux = Arrays.copyOf(array,array.length+1);

        aux[aux.length-1]=coordinate;

        return aux;
    }

    private Cliente[] remove(Cliente cliente){

        int encontrados=0;

        Cliente[] aux = new Cliente[clientes.length];

        int i=0,j=0;
        while (j<clientes.length){
            if(!clientes[i].equals(cliente)) {
                aux[i++] = clientes[j];
            }else
                encontrados++;
            j++;
        }

        if(encontrados==0) return clientes;

        return Arrays.copyOf(aux,aux.length-encontrados);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "coche=" + coche +
                ", telefono='" + telefono + '\'' +
                ", area='" + area + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                ", comision=" + comision +
                ", salario=" + salario +
                ", supervisor=" + supervisor +
                '}';
    }
}
