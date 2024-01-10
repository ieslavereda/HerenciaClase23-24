package org.example;

public class Main {
    public static void main(String[] args) {

        Persona[] personas = new Persona[4];

        personas[0]=new Persona("Manolo","Garcia","123456789",33);
        personas[1]=new Alumno("Juan","Lopez","222222",22,"1234",TipoEstudio.ASIR_2);
        personas[2]=new Profesor("Joaquin","Sanchez","452345G",44,TipoEstudio.DAW_1,TipoEstudio.DAM_2);
        personas[3]=new Directivo("Luis","Perez","3452627T",55,"Jefe Estudios",TipoEstudio.ASIR_2);


        for(Persona p : personas)
            p.imprimirDNI();

        System.out.println(((Directivo)personas[3]).getCargo());


    }
}
