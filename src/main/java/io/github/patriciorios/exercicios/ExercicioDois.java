package io.github.patriciorios.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDois {
    public static void Fibo(int valor){


        int proximaPosicaoFibo = 0;
        boolean estaNaFibo = false;

        List<Integer> lista = new ArrayList<Integer>();
        lista.add(0);
        lista.add(1);

        while(valor> proximaPosicaoFibo){
            proximaPosicaoFibo = lista.get(lista.size()-1) + lista.get(lista.size()-2);
            lista.add(proximaPosicaoFibo);
            if( valor == proximaPosicaoFibo){
                estaNaFibo = true;
                break;
            }
        }
        if(estaNaFibo){
            System.out.println("Numero inserido esta na Fibonacci");
        } else {
            System.out.println("Numero inserido nao esta na Fibonacci");
        }
    }
}
