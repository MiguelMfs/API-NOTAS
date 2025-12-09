package com.escola.api_notas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class CalculadoraNotasServiceTest {

    private final CalculadoraNotasService service = new CalculadoraNotasService();

    @Test
    void testeMediaAritmetica() {
        List<Double> notas = Arrays.asList(7.0, 8.0, 9.0);
        assertEquals(8.0, service.calcularMediaAritmetica(notas), 0.001);
    }

    @Test
    void testeMediaPonderada() {
        List<NotaPonderadaDTO> notas = Arrays.asList(
            new NotaPonderadaDTO(10.0, 2.0),
            new NotaPonderadaDTO(5.0, 3.0)
        );
        assertEquals(7.0, service.calcularMediaPonderada(notas), 0.001);
    }

    @Test
    void testeMaiorNota() {
        List<Double> notas = Arrays.asList(2.5, 9.8, 5.0);
        assertEquals(9.8, service.encontrarMaiorNota(notas), 0.001);
    }

    @Test
    void testeMenorNota() {
        List<Double> notas = Arrays.asList(2.5, 9.8, 5.0);
        assertEquals(2.5, service.encontrarMenorNota(notas), 0.001);
    }
}