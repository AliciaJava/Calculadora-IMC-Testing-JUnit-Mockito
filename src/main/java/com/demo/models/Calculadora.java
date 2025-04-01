package com.demo.models;

public class Calculadora {

    public static double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            throw new IllegalArgumentException("El peso y la altura deben ser mayores que 0.");
        }
        double imc = peso / (altura * altura);
        return Math.round(imc * 1000.0) / 1000.0; // Redondeo a 3 decimales
    }
}

