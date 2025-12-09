package com.escola.api_notas; // <--- Ajustado aqui

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notas")
public class NotasController {

    @Autowired
    private CalculadoraNotasService service;

    @PostMapping("/media-aritmetica")
    public Double mediaAritmetica(@RequestBody List<Double> notas) {
        return service.calcularMediaAritmetica(notas);
    }

    @PostMapping("/media-ponderada")
    public Double mediaPonderada(@RequestBody List<NotaPonderadaDTO> notas) {
        return service.calcularMediaPonderada(notas);
    }

    @PostMapping("/maior")
    public Double maiorNota(@RequestBody List<Double> notas) {
        return service.encontrarMaiorNota(notas);
    }

    @PostMapping("/menor")
    public Double menorNota(@RequestBody List<Double> notas) {
        return service.encontrarMenorNota(notas);
    }
}