package com.amanda.estruturadados.fila;

public class UsandoAFila {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.espia());

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila);
        System.out.println(fila.espia());

        fila.desenfileira();
        System.out.println(fila);
    }
}
