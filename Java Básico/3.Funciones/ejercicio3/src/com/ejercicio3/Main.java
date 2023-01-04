package com.ejercicio3;

/**
 * En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
 *
 * Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
 *
 * String[] nombres = {"", "", "", ""}
 */
public class Main {
    public static void main(String[] args) {

        String[] names = {"John", "Paul", "George", "Ringo"};

        String concatnames ="";

        System.out.println("Los Beattles eran:");

        for (String name: names) {
            if(concatnames == "") {     // Se introduce esta sentencia de control para que en la primera
                concatnames = name;     // iteración no se añada una coma(,) si no hay un nombre antes.
                continue;               // Salta a la siguiente iteración.
            }
            concatnames = concatnames + ", " + name;
        }
        System.out.println(concatnames);
    }
}