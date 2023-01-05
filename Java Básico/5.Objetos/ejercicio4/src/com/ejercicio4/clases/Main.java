package com.ejercicio4.clases;

import com.ejercicio4.herencia.SmartPhone;
import com.ejercicio4.herencia.SmartWatch;

/**
 * Enunciado del ejercicio:
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 * Crear constructor vacío y con todos los parámetros para cada clase.
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */
public class Main {

    public static void main(String[] args) {

        /**
         * creación de un dispositivo sin parámetros.
         */
        SmartPhone phone1 = new SmartPhone();

        /**
         * asignación de valores a los parámetros.
         */
        phone1.manufacturer = "Xiaomi";
        phone1.model = "POCO X3";
        phone1.screenSize = 6.67;
        phone1.batLong = 24;
        phone1.devOs = "Android";
        phone1.numCam = 4;
        phone1.nfc = true;
        phone1.fingerPrint = true;

        /**
         * Creación de un dispositivo con el constructor con todos los parámetros.
         */
        SmartPhone phone2 = new SmartPhone(30, 6.06, "Apple", "iPhone 11", "iOS", 2, true, true);

        /**
         * Creación de un dispositivo sin parámetros.
         */
        SmartWatch watch1 = new SmartWatch();
        /**
         * Asignación de valores a los parámetros.
         */
        watch1.manufacturer = "Xiaomi";
        watch1.model = "miBand 3";
        watch1.screenSize = 0.78;
        watch1.batLong = 120;
        watch1.screenColor = false;
        watch1.changeBracelet = true;

        /**
         * Creación de un dispositivo con el constructor con todos los parámetros.
         */
        SmartWatch watch2 = new SmartWatch(40, 1.2, "Samsung", "Galaxy Watch 4", true, true);

        /**
         * llamadas a los métodos internos toString() para cada dispositivo creado.
         */
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(watch1);
        System.out.println(watch2);
    }
}
