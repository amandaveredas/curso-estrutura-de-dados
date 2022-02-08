package com.amanda.estruturadados.pilha;

public class UsandoAPilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha);
        System.out.println(pilha.getTamanho());

        for(int i=1;i<=11;i++){
            pilha.empilha(i);
        }
        System.out.println(pilha);
    }
}
