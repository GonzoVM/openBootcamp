package com.ejercicio4.clases;

public class SmartDevice {

    /**
     * Atributos comunes a todos los dispositivos inteligentes.
     */
    protected int batLong;          // duración batería en horas
    protected double screenSize;    // tamaño pantalla en pulgadas
    protected String manufacturer;  // fabricante
    protected String model;         // modelo

    /**
     * Iniciailzación de consturctor vacío.
     */
    public SmartDevice(){}

    /**
     * Constructor con todos los atributos.
     *
     * @param batLong duración de batería en horas
     * @param screenSize tamaño de pantalla en pulgadas
     * @param manufacturer fabricante
     * @param model modelo
     */
    public SmartDevice(int batLong, double screenSize, String manufacturer, String model){
        this.batLong = batLong;
        this.screenSize = screenSize;
        this.manufacturer = manufacturer;
        this.model = model;
    }
}
