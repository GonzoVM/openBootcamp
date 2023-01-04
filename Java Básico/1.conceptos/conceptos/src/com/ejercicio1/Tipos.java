package com.ejercicio1;

public class Tipos {
    public static void main(String[] args) {
        // Tipos de datos

        //números enteros
        byte num1 = 1;
        short num2 = 2;
        int num3 = 3;
        long num4 = 4;

        //números con coma flotante
        float decimal1 = 1.1f;  // se incluye f al final del número para forzar a que sea float
        double decimal2 = 2.2d; // ya que por defecto, los números con coma en java son tipo double.

        //caracter
        char ch1 = 'a';

        //booleano
        boolean verdadero = true;
        boolean falso = false;

        //hasta aquí son tipos primitivos y no pueden ser nulos.

        //cadenas de texto
        String nombre = "Gonzalo";      // El tipo String es una clase interna de java.
        String apellido = "Vico";       // Por eso su color es distinto a los otros tipos.

        //Tipos envoltorio

        Integer numero = null;      // Estos tipos también son clases internas y pueden declararse nulos.
        Long numero2 = 1L;
    }
}
