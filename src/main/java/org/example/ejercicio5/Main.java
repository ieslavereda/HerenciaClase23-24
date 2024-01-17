package org.example.ejercicio5;

public class Main {

    public static void main(String[] args) {
        Empleado[] empleados = {
          new Vendedor("Luis","Garcia","111","una","66666",30000,new Coche("Tesla","3","1111BXG"),"12345","Valencia",1.5f),
                new JefeZona("Carlos","Garcia","111","una","66666",30000,2,null,new Coche("Tesla","3","1111BXG"),null),
                new Secretario("Manuel","Garcia","111","una","66666",30000,1,"9634214")
        };

        for (Empleado e : empleados)
            e.incrementarSalario();

        for(Empleado e: empleados)
            System.out.println(e);
    }
}
