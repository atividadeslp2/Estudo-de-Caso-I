package com.github.ricardor211.questao2;

public class Televisao {

    private float tamanhoDaTela;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;

    public Televisao(String marca, float tamanhoDaTela, int voltagem) {
        //Iniciando em 5
        this.volume = 5;
        this.canal = 1;

        this.marca = marca;
        this.tamanhoDaTela = tamanhoDaTela;
        this.voltagem = voltagem;
    }

    public void ligar() {
        float consumo = voltagem * tamanhoDaTela;

        System.out.println("Televisão ligada");
        System.out.println("O consumo é de: " + consumo + " W");
    }

    public void desligar() {
        System.out.println("Televisão desligada");
    }

    public void aumentarVolume() {
        if(this.volume < 10) this.volume++;
        else System.out.println("A televisão já está no volume máximo (10)");
    }

    public void diminuirVolume() {
        if(this.volume > 1) this.volume--;
        else System.out.println("A televisão já está no volume mínimo (1)");
    }

    public void aumentarCanal() {
        this.canal++;
        System.out.println("Canal: " + this.canal);
    }

    public void diminuirCanal() {
        if(this.canal > 1) {
            this.canal--;
            System.out.println("Canal: " + this.canal);
        } else {
            System.out.println("Você já está no canal 1");
        }
    }
}
