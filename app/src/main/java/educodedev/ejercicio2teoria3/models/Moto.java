package educodedev.ejercicio2teoria3.models;

import java.io.Serializable;

public class Moto implements Serializable {
    private String marca;
    private String modelo;
    private String cilindrada;

    public Moto() {
    }

    public Moto(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return cilindrada;
    }

    public void setColor(String color) {
        this.cilindrada = color;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + cilindrada + '\'' +
                '}';
    }
}
