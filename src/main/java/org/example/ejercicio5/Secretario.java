package org.example.ejercicio5;

public class Secretario extends Empleado {

    private int despacho;
    private String fax;

    public Secretario(String nombre, String apellidos, String DNI, String dirección, String telefono, float salario, int despacho, String fax) {
        super(nombre, apellidos, DNI, dirección, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }


    @Override
    public void cambiarSupervisor(Empleado empleado) {

        if (empleado instanceof Secretario || empleado instanceof JefeZona)
            supervisor = empleado;

    }

    @Override
    public void incrementarSalario() {
        salario *= 1.15;
    }

    @Override
    public String toString() {
        return "Secretario{" +
                "despacho=" + despacho +
                ", fax='" + fax + '\'' +
                ", salario=" + salario +
                ", supervisor=" + supervisor +
                '}';
    }
}
