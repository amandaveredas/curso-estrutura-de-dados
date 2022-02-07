package com.amanda.estruturadados.vetor;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println(vetor.getTamanho());
        System.out.println(vetor);
        System.out.println(vetor.busca(0));
        System.out.println(vetor.busca("elemento 5"));
    }
}
