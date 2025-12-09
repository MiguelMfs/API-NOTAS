package com.escola.api_notas;

import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class CalculadoraNotasService {

    // Calcula a média aritmética
    public double calcularMediaAritmetica(List<Double> notas) {
        if (notas == null || notas.isEmpty()) return 0.0;

        double soma = 0.0;
        for (Double nota : notas) {
            soma += nota; // Double pode ser somado a double sem problemas
        }
        return soma / notas.size();
    }

    // Calcula a média ponderada
    public double calcularMediaPonderada(List<NotaPonderadaDTO> notasComPesos) {
        if (notasComPesos == null || notasComPesos.isEmpty()) return 0.0;

        double somaNotas = 0.0;
        double somaPesos = 0.0;

        for (NotaPonderadaDTO n : notasComPesos) {
            // Como nota e peso são double primitivos, não precisamos checar null
            somaNotas += n.getNota() * n.getPeso();
            somaPesos += n.getPeso();
        }

        return somaPesos == 0.0 ? 0.0 : somaNotas / somaPesos;
    }

    // Retorna a maior nota
    public double encontrarMaiorNota(List<Double> notas) {
        if (notas == null || notas.isEmpty()) return 0.0;
        return Collections.max(notas);
    }

    // Retorna a menor nota
    public double encontrarMenorNota(List<Double> notas) {
        if (notas == null || notas.isEmpty()) return 0.0;
        return Collections.min(notas);
    }
}
