package io.github.patriciorios.exercicios;

public class ExercicioUm {
    public static void ValorDaSoma(){
        int INDICE = 13;
        int soma = 0;
        int k = 0;

        while( k < INDICE){
            k += 1;
            soma += k;
        }
        System.out.println(soma);
    }
}
