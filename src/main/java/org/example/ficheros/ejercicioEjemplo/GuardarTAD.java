package org.example.ficheros.ejercicioEjemplo;

public class GuardarTAD {

    public static void main(String[] args) {
//
//        ListaSE<Persona> personas = new ListaSE<>();
//
//        personas.addHead(new Persona("Joaquin","Alonso","jv.alons@edu.gva.es"));
//        personas.addHead(new Persona("Luis","Sanz","jv.alons@edu.gva.es"));
//        personas.addHead(new Persona("Pedro","Gimenez","jv.alons@edu.gva.es"));
//        personas.addHead(new Persona("Carmen","Lopez","jv.alons@edu.gva.es"));
//
//        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("milista.txt"))){
//
//            oos.writeObject(personas);
//
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//        personas.guardar("otrofichero.txt");

        ListaSE<Persona> personas = new ListaSE<>();
        personas.cargar("otrofichero.txt");
        System.out.println(personas);


    }

}
