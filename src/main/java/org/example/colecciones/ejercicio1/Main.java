package org.example.colecciones.ejercicio1;

public class Main {

    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        almacen.addEmploye(new Trabajador("Luis",22),new Pais("España"));
        almacen.addEmploye(new Trabajador("Juan",44),new Pais("España"));
        almacen.addEmploye(new Trabajador("Manuel",25),new Pais("España"));
        almacen.addEmploye(new Trabajador("Luis",22),new Pais("España"));
        almacen.addEmploye(new Trabajador("Luis",18),new Pais("Italia"));
        almacen.addEmploye(new Trabajador("Tomas",33),new Pais("Italia"));
        almacen.addEmploye(new Trabajador("Carmen",76),new Pais("Italia"));
        almacen.addEmploye(new Trabajador("Carmencita",76),new Pais("Italia"));
        almacen.addEmploye(new Trabajador("Lorena",55),new Pais("Italia"));
        almacen.addEmploye(new Trabajador("Lorenzo",55),new Pais("Alemania"));
        almacen.addEmploye(new Trabajador("Juan",65),new Pais("Francia"));
        almacen.addEmploye(new Trabajador("Juan Jose",65),new Pais("Francia"));
        System.out.println(almacen);

        almacen.showSortedCountriesList();
        almacen.showEmployeeSortedList();




    }
}
