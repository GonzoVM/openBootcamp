package com.ejercicio4.herencia;

import com.ejercicio4.clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    /**
     * Atributos únicos de smartwatch.
     */
    public boolean screenColor;
    public boolean changeBracelet;

    /**
     * inicialización de constructor vacío.
     */
    public SmartWatch() {}

    /**
     * Constructor con todos los atributos propios y heredados.
     *
     * @param batLong duración de la batería en horas.
     * @param screenSize tamaño de la pantalla en pulgadas.
     * @param manufacturer fabricante.
     * @param model modelo.
     * @param screenColor Pantalla a color sí o no.
     * @param changeBracelet Pulsera intercambiable sí o no.
     */
    public SmartWatch(int batLong, double screenSize, String manufacturer, String model, boolean screenColor, boolean changeBracelet) {
        super(batLong, screenSize, manufacturer, model);
        this.screenColor = screenColor;
        this.changeBracelet = changeBracelet;
    }

    /**
     * Método toString() para imprimir los atributos.
     * @return devuelve todos los atributos del dispositivo.
     */
    @Override
    public String toString() {
        return "SmartWatch: " +
                "Fabricante: '" + manufacturer + '\'' +
                ", modelo: '" + model + '\'' +
                ", pantalla a color: " + screenColor +
                ", pulsera intercambiable: " + changeBracelet +
                ", duración batería (en horas): " + batLong +
                ", tamaño pantalla: " + screenSize +
                " pulgadas.";
    }
}
