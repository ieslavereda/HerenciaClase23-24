package org.example.ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {

        try(FileInputStream in = new FileInputStream("xanadu.txt");
            FileOutputStream out = new FileOutputStream("outagain.txt"))
        {

            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}