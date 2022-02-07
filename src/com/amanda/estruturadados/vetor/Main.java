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





    }
}
