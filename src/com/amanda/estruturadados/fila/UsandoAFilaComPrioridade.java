package com.amanda.estruturadados.fila;

public class UsandoAFilaComPrioridade {
    public static void main(String[] args) {
        FilaPrioridade<Integer> filaPrioridade = new FilaPrioridade<>();

        filaPrioridade.enfileira(2);
        filaPrioridade.enfileira(5);
        filaPrioridade.enfileira(1);
        filaPrioridade.enfileira(4);

        System.out.println(filaPrioridade);

    }
}
