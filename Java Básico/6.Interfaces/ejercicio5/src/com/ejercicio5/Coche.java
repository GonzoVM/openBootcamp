package com.ejercicio5;

/**
 * Clase utilizada para la creación de objetos Coche fuera de la implementación de la interfaz para no
 * influir en esta.
 */
public class Coche {
    String marca;
    String modelo;

    public Coche() {}
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Método toString() para que al devolver el valor de la lista, devuelva los datos y no la posición de memoria.
     * @return los datos incluidos en la lista.
     */
    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
