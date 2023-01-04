package com.ejercicio1;

/**
 * Para este primer ejercicio tendréis que realizar lo siguiente:
 *  - Crea un proyecto de Java desde 0
 *  - Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
 *  - Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 * Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
 */


public class Main {

    /**
     * Se crean las clases Vehículo y Coche para probar los distintos tipos de datos y la herencia de clases.
     * @param args -- argumentos del main
     */
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
        coche2.setMatricula("5678 FGH");
        coche2.setNumPuertas(3);
        coche2.setKilometros(2734.37);

        System.out.println("El coche " + coche1.getMarca() + " " + coche1.getModelo() + "con matrícula " + coche1.getMatricula() + ":");
        if(coche1.disponibilidad) {
            System.out.println("está disponible, tiene " + coche1.getNumPuertas() + " puertas y lleva " + coche1.getKilometros() + " km.");
        }
        else System.out.println("no está disponible");


        System.out.println("El coche " + coche2.getMarca() + " " + coche2.getModelo() + "con matrícula " + coche2.getMatricula() + ":");
        if(coche2.disponibilidad) {
            System.out.println("está disponible, tiene " + coche2.getNumPuertas() + " puertas y lleva " + coche2.getKilometros() + " km.");
        }
        else System.out.println("no está disponible");
    }
}
