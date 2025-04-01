package com.demo.controllers;

import com.demo.models.OperacionIMC;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CalculadoraController {

    private List<OperacionIMC> historialOperaciones = new ArrayList<>();

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        // Enviar el historial al modelo
        model.addAttribute("historial", historialOperaciones);
        return "calculadora";
    }

    @PostMapping("/calcular")
    public String calcularIMC(@RequestParam("peso") double peso,
                              @RequestParam("altura") double altura,
                              Model model) {
        if (peso <= 0 || altura <= 0) {
            model.addAttribute("mensajeError", "Por favor, ingresa valores válidos.");
            model.addAttribute("historial", historialOperaciones);
            return "calculadora";
        }

        // Calcular el IMC
        double imc = peso / (altura * altura);
        imc = Math.round(imc * 100.0) / 100.0;

        // Determinar categoría
        String categoria;
        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 24.9) {
            categoria = "Peso normal";
        } else if (imc < 29.9) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        // Guardar operación en el historial
        OperacionIMC operacion = new OperacionIMC(peso, altura, imc, categoria);
        historialOperaciones.add(operacion);

        // Agregar datos al modelo
        model.addAttribute("resultado", imc);
        model.addAttribute("categoria", categoria);
        model.addAttribute("historial", historialOperaciones);

        return "calculadora";
    }
}

