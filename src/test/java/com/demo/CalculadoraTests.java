package com.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;

import com.demo.Calculadora;

public class CalculadoraTests {

    private Calculadora calculadora;

    @BeforeAll
    public void iniciarAntesDeTodo() {
        calculadora = new Calculadora();
    }

    @Before
    public void iniciar() {
        calculadora = new Calculadora();
    }

    @AfterAll
    public void despuesDeCadaTest() {

    }

    @Test
    public void calcularIMC_PersonaDelgada() throws InterruptedException {
        // GIVEN
        double altura = 175;
        double peso = 72;

        // WHEN
        double imc = calculadora.calcularIMC(peso, altura);

        // THEN
        Assert.assertEquals(0.002, imc, 3);
    }

    @Test
    public void calcularIMC_PersonaObesa() throws InterruptedException {
        // GIVEN
        double altura = 160;
        double peso = 110;

        // WHEN
        double imc = calculadora.calcularIMC(peso, altura);

        // THEN
        Assertions.assertAll(
                () -> Assert.assertEquals(0.004, imc, 3),
                () -> Assert.assertTrue(imc > 0)
        );

    }

    @DisplayName("No puede tener valores con 0")
    @Test(expected = IllegalArgumentException.class)
    public void calcularIMC_NoPuedeTenerValoresCon0() throws InterruptedException {
        double peso = 110;

        calculadora.calcularIMC(peso, 0);
    }



    @Test(timeout = 2000)
    public void calcularIMC_TimeOut() throws InterruptedException {
        // GIVEN
        double altura = 170;
        double peso = 110;

        calculadora.calcularIMC(peso, altura);
    }

}
