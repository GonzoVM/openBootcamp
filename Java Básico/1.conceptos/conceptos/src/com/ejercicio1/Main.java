package com.ejercicio1;

/**
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 *  - Crea un proyecto de Java desde 0
 *  - Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 *  - Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 * Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */
public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.disponibilidad = true;
        coche1.setMarca("Seat");
        coche1.setModelo("Ibiza");
        coche1.setMatricula("1234 BCD");
        coche1.setNumPuertas(5);
        coche1.setKilometros(10034.50);

        Coche coche2 = new Coche();

        coche2.disponibilidad = false;
        coche2.setMarca("Audi");
        coche2.setModelo("A3");
        coche2.setMatricula("1234 BCD");
        coche2.setNumPuertas(3);
        coche2.setKilometros(2734.37);


    }
}
