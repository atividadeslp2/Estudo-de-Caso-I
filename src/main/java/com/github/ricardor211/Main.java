package com.github.ricardor211;

import com.github.ricardor211.questao1.Carro;
import com.github.ricardor211.questao2.Televisao;

public class Main {
    public static void main(String[] args) {
        // Testando o Carro
        Carro meuCarro = new Carro("Civic", 5);
        meuCarro.ligar();
        meuCarro.acelerar();

        System.out.println("-----------------");

        // Testando a TV
        Televisao minhaTv = new Televisao("Samsung", 50.0f, 220);
        minhaTv.ligar();
        minhaTv.aumentarVolume();
    }
}