package com.ejercicio6;

import java.util.Vector;

/**
 * 3. Se crea un Vector de Integers con tamaño inicial de 5 valores y se eliminan el 2º y el 3.er elemento.
 */
public class VectorInt {
    Vector<Integer> vector = new Vector<>(5);


    public Vector<Integer> VectorInteger() {
        vector.remove(1);   // Se elimina el segundo elemento, el tercero pasa a ser el segundo.
        vector.remove(1);   // Se elimina el tercer elemento que ahora está en segunda posición.
        return vector;
    }
}
