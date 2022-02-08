package com.amanda.estruturadados.pilha;

import com.amanda.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }


}
