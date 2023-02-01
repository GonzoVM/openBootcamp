package com.ejercicio6;


public class ReverseString {

    /**
     * Función reverse() que devuelve el texto al revés.
     * @param texto - cadena de texto recibida en la llamada.
     * @return reverseText - cadena de texto donde se concatenan los caracteres del último al primero.
     */
    public static String reverse(String texto) {
        String reverseText = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            reverseText += texto.charAt(i);
        }
        return reverseText;
    }
}
