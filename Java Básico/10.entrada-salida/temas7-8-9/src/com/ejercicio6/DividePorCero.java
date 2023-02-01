package com.ejercicio6;

public class DividePorCero {

    /**
     * Función que divide dos números y lanza una excepción aritmética a la llamada.
     * @param num1 - primer número dado en la llamada.
     * @param num2 - segundo número dado en la llamada, este es 0 para probar las excepciones.
     * @throws ArithmeticException - devuelve excepción aritmética a la llamada.
     */
    public DividePorCero(int num1, int num2) throws ArithmeticException {
        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        } finally {
            System.out.println("Demo de código");
        }
    }
}
