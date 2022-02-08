package com.amanda.estruturadados.fila;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class UsandoApisNativas {
    public static void main(String[] args) {

        Queue<Integer> filaComPrioridade = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return Integer.valueOf(o1.compareTo(o2));
                    }
                }

        );

        filaComPrioridade.add(3);
        filaComPrioridade.add(2);
        filaComPrioridade.add(1);

        System.out.println(filaComPrioridade);
    }
}
