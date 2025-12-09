package com.escola.api_notas;

public class TestaCalculos {

    public static void main(String[] args) {
        // 1. DADOS (Vamos simular 4 notas)
        double[] notas = { 8.0, 5.5, 9.0, 6.5 };
        double[] pesos = { 2,   3,   4,   1 }; // Pesos para a média ponderada

        // --- CÁLCULO 1: MÉDIA ARITMÉTICA (Soma tudo / Quantidade) ---
        double somaTotal = 0;
        for (double nota : notas) {
            somaTotal += nota;
        }
        double mediaAritmetica = somaTotal / notas.length;
        System.out.println("Média Aritmética: " + mediaAritmetica);

        // --- CÁLCULO 2: MÉDIA PONDERADA (Soma (nota * peso) / Soma dos pesos) ---
        double somaNotasPonderada = 0;
        double somaPesos = 0;
        
        for (int i = 0; i < notas.length; i++) {
            somaNotasPonderada += (notas[i] * pesos[i]); // Nota * Peso correspondente
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaNotasPonderada / somaPesos;
        System.out.println("Média Ponderada: " + mediaPonderada);

        // --- CÁLCULO 3 e 4: MAIOR E MENOR NOTA ---
        // Truque: Assumimos que a primeira nota é a maior E a menor para começar
        double maiorNota = notas[0];
        double menorNota = notas[0];

        for (double nota : notas) {
            if (nota > maiorNota) {
                maiorNota = nota; // Achei uma maior, atualizo
            }
            if (nota < menorNota) {
                menorNota = nota; // Achei uma menor, atualizo
            }
        }
        System.out.println("Maior Nota: " + maiorNota);
        System.out.println("Menor Nota: " + menorNota);
    }
}