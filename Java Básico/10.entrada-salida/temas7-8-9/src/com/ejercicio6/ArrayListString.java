package com.ejercicio6;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 5. Se crea ArrayList de tipo String, se copia a una LinkedList y se recorren ambas mostrando el valor.
 */
public class ArrayListString {
    ArrayList<String> lista = new ArrayList<>();

    LinkedList<String> listaEnlazada = new LinkedList<>(lista);

    public void ArrayListSt() {
        System.out.println("ArrayList:");
        for (String s : lista) {
            System.out.println(s);
        }
        System.out.println("LinkedList:");
        for (String s : listaEnlazada) {
            System.out.println(s);
        }
    }
}