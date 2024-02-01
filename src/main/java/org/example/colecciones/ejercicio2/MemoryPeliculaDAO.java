package org.example.colecciones.ejercicio2;

import java.util.*;

public class MemoryPeliculaDAO {

    List<PeliculaTO> peliculaTOList;

    public MemoryPeliculaDAO() {
        peliculaTOList = new LinkedList<>();
    }

    public boolean add(PeliculaTO peliculaTO){

        if(peliculaTOList.contains(peliculaTO)) return false;


        return peliculaTOList.add(peliculaTO);
    }

    public List<PeliculaTO> getPeliculas(){
        return new ArrayList<>(peliculaTOList);
    }

    public boolean remove(int id){

        PeliculaTO pelicula;
        Iterator<PeliculaTO> iterator = peliculaTOList.listIterator();
        boolean eliminado = false;


        while (iterator.hasNext() && !eliminado){

            pelicula = iterator.next();
            if(pelicula.getId()==id) {
                iterator.remove();
                eliminado=true;
            }


        }

        return eliminado;

    }

    public boolean remove(PeliculaTO pelicula){
        return peliculaTOList.remove(pelicula);
    }

    public void showList(){

        for(PeliculaTO pelicula : peliculaTOList)
            System.out.println(pelicula);

    }


    public PeliculaTO getPelicula(int id) {

        PeliculaTO pelicula = null;

        Iterator<PeliculaTO> iterator = peliculaTOList.listIterator();

        while (iterator.hasNext() && pelicula==null){
            PeliculaTO aux = iterator.next();
            if(aux.getId()==id)
                pelicula=aux;
        }
        return pelicula;

    }

    public List<PeliculaTO> getSortedList(){

        List<PeliculaTO> listado = new ArrayList<>(peliculaTOList);

        Collections.sort(listado);

        return listado;

    }
}
