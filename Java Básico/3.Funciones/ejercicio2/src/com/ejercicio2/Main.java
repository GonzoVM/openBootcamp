package com.ejercicio2;

/**
 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 */
public class Main {
    /**
     * se crea la variable price y llama a la función calcTax
     * @param args
     */
    public static void main(String[] args) {
        double price = 10;
        System.out.println("El precio sin IVA es: " + price);

        System.out.println("El precio con IVA es: " + calcTax(price));
    }

    /**
     *
     * @param price - el precio del producto
     * @return  devuelve el precio más el 21% de IVA
     */
    private static double calcTax(double price) {
        return price * 1.21;
    }
}