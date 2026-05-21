package com.github.ricardor211.questao1;

public class Carro {

    private String modelo;
    private float velocidade;
    private float aceleracao;
    private int marcha;
    private int marchaLimite;
    private boolean ligado;


    public Carro(String modelo, int marchaLimite) {
        this.modelo = modelo;
        this.ligado = false;
        this.marchaLimite = marchaLimite;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O carro está ligado");
    }
    public void desligar() {
        this.ligado = false;
        System.out.println("O carro está desligado");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando");
        this.velocidade++;
    }
    public void desacelerar() {
        System.out.println("O carro está desacelerando");
        this.velocidade--;
    }

    public void virarParaEsquerda() {
        System.out.println("O carro virou para esquerda");
    }
    public void virarParaDireita () {
        System.out.println("O carro virou para direita");
    }

    public void marchaParaCima(){
        if (this.marcha < this.marchaLimite) {
            this.marcha = this.marcha + 1;
            System.out.println("Subiu para a marcha: " + this.marcha);
        } else {
            System.out.println("Já está na marcha máxima!");
        }
    }

    public void marchaParaBaixo() {
        if (this.marcha > 0) {
            this.marcha = this.marcha - 1;
            System.out.println("Reduziu para a marcha: " + this.marcha);
        } else {
            System.out.println("O carro já está em ponto morto.");
        }
    }
}
