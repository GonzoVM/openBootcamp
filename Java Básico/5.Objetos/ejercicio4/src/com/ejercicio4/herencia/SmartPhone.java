package com.ejercicio4.herencia;

import com.ejercicio4.clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    /**
     * Atributos únicos de smartphone.
     */
    public String devOs;           // Sistema Operativo
    public int numCam;             // número de cámaras
    public boolean nfc;            // NFC sí o no
    public boolean fingerPrint;    // Sensor de huellas sí o no

    /**
     * Constructor vacío.
     */
    public SmartPhone() {
    }

    /**
     * Constructor con todos los atributos propios y heredados.
     *
     * @param batLong duración de la batería en horas.
     * @param screenSize tamaño de pantalla en pulgadas.
     * @param manufacturer fabricante.
     * @param model modelo.
     * @param devOs Sistema Operativo.
     * @param numCam número de cámaras.
     * @param nfc NFC sí o no.
     * @param fingerPrint Sensor de huellas sí o no.
     */
    public SmartPhone(int batLong, double screenSize, String manufacturer, String model, String devOs, int numCam, boolean nfc, boolean fingerPrint) {
        super(batLong, screenSize, manufacturer, model);
        this.devOs = devOs;
        this.numCam = numCam;
        this.nfc = nfc;
        this.fingerPrint = fingerPrint;
    }

    /**
     * Método toString() para imprimir los atributos.
     * @return devuelve todos los atributos del dispositivo.
     */
    @Override
    public String toString() {
        return "SmartPhone: " +
                "Fabricante: '" + manufacturer + '\'' +
                ", modelo: '" + model + '\'' +
                ", Sistema Operativo: '" + devOs + '\'' +
                ", cámaras: " + numCam +
                ", NFC: " + nfc +
                ", Sensor de huellas: " + fingerPrint +
                ", duración baterías (en horas): " + batLong +
                ", tamaño pantalla: " + screenSize +
                " pulgadas.";
    }
}
