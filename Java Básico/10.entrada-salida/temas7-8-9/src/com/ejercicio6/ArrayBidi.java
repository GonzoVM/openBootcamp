package com.ejercicio6;

/**
 * 2. Se crea una Array bidimensional de enteros y se recorre mostrando la posición y el valor dentro de esta.
 */
public class ArrayBidi {
    public int[][] arrayInt;

    public void ArrayBidim() {
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                System.out.println("Posición: " + i + "." + j + " valor: " + arrayInt[i][j]);
            }
        }
    }
}
