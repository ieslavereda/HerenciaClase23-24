package org.example.colecciones.ejercicio2;

public class Main {
    public static void main(String[] args) {
        MemoryPeliculaDAO memory = new MemoryPeliculaDAO();

        PeliculaTO p1 = new PeliculaTO(1,"El señor de los anillos");

        p1.addActor("Morgan");

        memory.add(p1);
        memory.add(new PeliculaTO(2,"Alguien volo sobre el nido del cuco"));

        memory.getPelicula(1).addActor("Juan");

        //memory.remove(new PeliculaTO(1,""));

        // Añado 1000 pelis


        memory.showList();
    }
}
