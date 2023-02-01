package com.ejercicio6;

import java.io.*;

/**
 * 8. Utilizando InputStream y PrintStream, se copia un fichero en otro.
 */
public class CopyFile {

    public CopyFile(InputStream fileIn, PrintStream fileOut) throws IOException {
        try {
            byte[] fileBytes = fileIn.readAllBytes();
            fileOut.write(fileBytes);
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura: " + e.getMessage());
        }
    }

}
