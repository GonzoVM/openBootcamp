package com.ejercicio1;

public class Vehiculo {
    String marca;
    String modelo;
    String matricula;
    double kilometros;
    boolean disponibilidad;

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }
    public double getKilometros() {
        return kilometros;
    }
}
