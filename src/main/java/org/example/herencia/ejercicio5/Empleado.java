package org.example.herencia.ejercicio5;

public abstract class Empleado extends Persona{

    private int antiguedad;
    private String telefono;
    protected float salario;

    protected Empleado supervisor;


    public Empleado(String nombre, String apellidos, String DNI, String dirección, String telefono, float salario) {
        super(nombre, apellidos, DNI, dirección);
        this.antiguedad = 0;
        this.telefono = telefono;
        this.salario = salario;
    }

    public abstract void cambiarSupervisor(Empleado empleado);
    public abstract void incrementarSalario();


    @Override
    public String toString() {
        return "Empleado{" +
                "antiguedad=" + antiguedad +
                ", telefono='" + telefono + '\'' +
                ", salario=" + salario +
                ", supervisor=" + supervisor +
                '}';
    }
}
