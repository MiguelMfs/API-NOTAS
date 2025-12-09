package com.escola.api_notas; // <--- Ajustado aqui

public class NotaPonderadaDTO {
    private double nota;
    private double peso;

    public NotaPonderadaDTO() {}

    public NotaPonderadaDTO(double nota, double peso) {
        this.nota = nota;
        this.peso = peso;
    }

    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}