package org.example.ejercicio5;

import java.util.Arrays;

public class JefeZona extends Empleado{

    private int despacho;
    private Secretario secretario;
    private Vendedor[] vendedores;
    private Coche coche;


    public JefeZona(String nombre, String apellidos, String DNI, String dirección, String telefono, float salario, int despacho, Secretario secretario, Coche coche,Vendedor... vendedores) {
        super(nombre, apellidos, DNI, dirección, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.vendedores = vendedores;
        this.coche = coche;
    }

    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void addVendendor(Vendedor vendedor){
        vendedores= add(vendedor, vendedores);
    }

    @Override
    public void cambiarSupervisor(Empleado empleado) {
        if(empleado instanceof JefeZona)
            supervisor=empleado;
    }

    @Override
    public void incrementarSalario() {
        salario*=1.05;
    }


    protected Vendedor[] add(Vendedor empleado, Vendedor[] array){

        if(empleado==null) return array;

        Vendedor[] aux = Arrays.copyOf(array,array.length+1);

        aux[aux.length-1]=empleado;

        return aux;
    }

    protected Vendedor[] remove(Vendedor empleado, Vendedor[] vendedores){

        int encontrados=0;

        Vendedor[] aux = new Vendedor[vendedores.length];

        int i=0,j=0;
        while (j<vendedores.length){
            if(!vendedores[i].equals(empleado)) {
                aux[i++] = vendedores[j];
            }else
                encontrados++;
            j++;
        }

        if(encontrados==0) return vendedores;

        return Arrays.copyOf(aux,aux.length-encontrados);
    }

    @Override
    public String toString() {
        return "JefeZona{" +
                "despacho=" + despacho +
                ", secretario=" + secretario +
                ", vendedores=" + Arrays.toString(vendedores) +
                ", coche=" + coche +
                ", salario=" + salario +
                ", supervisor=" + supervisor +
                '}';
    }
}
