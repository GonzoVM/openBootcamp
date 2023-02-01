package com.ejercicio6;

import java.util.ArrayList;

/**
 * 6. Se crea un ArrayList de tipo entero, se rellena con los números del 1 al 10 y se eliminan los pares.
 */
public class ArrayListInt {
    ArrayList<Integer> list = new ArrayList<>();

    /**
     * Función que agrega los números del 1 al 10.
     * @return list de enteros con los valores del 1 al 10.
     */
    public ArrayList<Integer> add() {
        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }
        return list;
    }

    /**
     * Función que recorre la ArrayList list y elimina los valores pares.
     * @return list de enteros con los valores impares entre el 1 y el 10.
     */
    public ArrayList<Integer> remove() {
        for (int i = 0; i <= list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        return list;
    }
}
