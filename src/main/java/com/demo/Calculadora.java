package com.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.TimeUnit;

public class Calculadora {

    /**
     * Calcula el Índice de Masa Corporal (IMC) basado en el peso y la altura.
     * 
     * @param peso   Peso en kilogramos (kg).
     * @param altura Altura en metros (m).
     * @return IMC redondeado a 3 decimales.
     * @throws IllegalArgumentException Si el peso o la altura son menores o iguales a 0.
     * @throws InterruptedException Simula un retardo en el cálculo.
     */
    public double calcularIMC(double peso, double altura) throws InterruptedException {
        // Validar entradas
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que 0.");
        }
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que 0.");
        }

        // Calcular IMC
        double imc = peso / (altura * altura);

        // Redondear a 3 decimales
        BigDecimal imcRedondeado = new BigDecimal(imc).setScale(3, RoundingMode.HALF_UP);

        // Simular un retardo (si es necesario)
        TimeUnit.SECONDS.sleep(1);

        return imcRedondeado.doubleValue();
    }
}
