package com.amanda.estruturadados.pilha;

import java.util.Locale;
import java.util.Stack;

public class DesafioPalindromo {
    public static void main(String[] args) {

        System.out.println( testaPalindromo("omissíssimo"));

    }

    public static boolean testaPalindromo(String palavra){

        palavra.toUpperCase(Locale.ROOT);

        Stack<Character> pilhaOriginal = new Stack<>();
        Stack<Character> pilhaNova = new Stack<>();

        for (int i=0;i<palavra.length();i++){
            pilhaOriginal.push(palavra.charAt(i));
        }

        for (int i=0;i<palavra.length()/2;i++){
            pilhaNova.push(pilhaOriginal.pop());
        }

        if(palavra.length() % 2 != 0){
            pilhaOriginal.pop();
        }


        if(pilhaOriginal.equals(pilhaNova))
            return true;

        return false;
    }
}
