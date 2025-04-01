package com.demo.models;

public class OperacionIMC {

    private double peso;
    private double altura;
    private double imc;
    private String categoria;

    // Constructor
    public OperacionIMC(double peso, double altura, double imc, String categoria) {
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.categoria = categoria;
    }

    // Getters y Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

