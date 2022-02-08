package com.amanda.estruturadados.pilha;

import java.util.Scanner;
import java.util.Stack;

public class Exer01 {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        Scanner scan = new Scanner(System.in);

        for(int i=0;i<=10;i++){
            System.out.println("Entre com um número: ");
            int num = scan.nextInt();

            if(num %2 == 0){
                System.out.println("Empilhando o número " + num);
                pilha.push(num);
            } else {
                if(pilha.isEmpty())
                    System.out.println("Pilha vazia!");
                else
                    pilha.pop();
            }
        }


        while (pilha.isEmpty() == false){
            System.out.println(pilha.pop());
        }

    }
}
