package com.amanda.estruturadados.vetor;

import com.amanda.estruturadados.base.EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T> {

    public Lista() {
        super();
    }

    public Lista(int capacidade) {
        super(capacidade);
    }

    public boolean adiciona(T elemento){
        return super.adiciona(elemento);
    }

    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao,elemento);
    }
}
