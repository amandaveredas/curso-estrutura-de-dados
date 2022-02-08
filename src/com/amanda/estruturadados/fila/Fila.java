package com.amanda.estruturadados.fila;

import com.amanda.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento){
        this.adiciona(elemento);
    }

    public T espia(){
        return this.elementos[0];
    }

    public T desenfileira(){
        int posicao = 0;
        if (this.estaVazio())
            return null;
        T elementoRemovido = this.elementos[posicao];
        this.remove(posicao);

        return elementoRemovido;
    }




}
