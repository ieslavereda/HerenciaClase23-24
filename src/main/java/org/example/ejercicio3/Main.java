package org.example.ejercicio3;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        Producto[] productos = new Producto[3];
        productos[0] = new Fresco(LocalDate.of(2024,Month.FEBRUARY,28),1,"Leche fresca",LocalDate.of(2023,Month.DECEMBER,31),"España");
        productos[1] = new Congelados(LocalDate.of(2024,Month.FEBRUARY,28),1,"Gambas congeladas",-32);
        productos[2] = new Refrigerado(LocalDate.of(2024,Month.FEBRUARY,28),1,"Pasta fresca",124213155);

        for (Producto producto : productos)
            producto.imprimirInformacion();



    }
}
