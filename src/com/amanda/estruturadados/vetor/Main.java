package com.amanda.estruturadados.vetor;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);

//        vetor.adiciona("elemento 1");
//        vetor.adiciona("elemento 2");
//        vetor.adiciona("elemento 3");
//
//        System.out.println(vetor.getTamanho());
//        System.out.println(vetor);
//        System.out.println(vetor.busca(0));
//        System.out.println(vetor.busca("elemento 5"));
//
//        vetor.adiciona(0,"elemento adicionado");
//        System.out.println(vetor);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        vetor.adiciona("elemento 5");
        vetor.adiciona("elemento 6");
        System.out.println(vetor.getTamanho());
        vetor.remove(2);
        System.out.println(vetor);

        VetorObjetos vetorObjetos = new VetorObjetos(4);
        vetorObjetos.adiciona(3);
        vetorObjetos.adiciona(4);
        vetorObjetos.adiciona(5);

        System.out.println(vetorObjetos);
        System.out.println(vetorObjetos.getTamanho());

        Contato contato1 = new Contato("Amanda","233333336","amanda@amanda.com.br");
        Contato contato2 = new Contato("Roni","233333336","roni@amanda.com.br");
        Contato contato3 = new Contato("Marluce","233333336","marluce@amanda.com.br");
        Contato contato4 = new Contato("Amanda","233333336","amanda@amanda.com.br");

        VetorObjetos contatos = new VetorObjetos(3);
        contatos.adiciona(contato1);
        contatos.adiciona(contato2);
        contatos.adiciona(contato3);

        int pos = contatos.busca(contato4);
        if (pos > -1){
            System.out.println("O contato está na posição " + pos);
        }else{
            System.out.println("Elemento não encontrado!");
        }

        System.out.println(contatos);



    }
}
