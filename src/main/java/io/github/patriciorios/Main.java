package io.github.patriciorios;

import io.github.patriciorios.exercicios.ExercicioCinco;
import io.github.patriciorios.exercicios.ExercicioDois;
import io.github.patriciorios.exercicios.ExercicioQuatro.ExercicioQuatro;
import io.github.patriciorios.exercicios.ExercicioTres;
import io.github.patriciorios.exercicios.ExercicioUm;

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero do teste que deseja executar: ");
        System.out.println("1 - Valor de soma");
        System.out.println("2 - Fibonacci");
        System.out.println("3 - Vetor");
        System.out.println("4 - Valor total mensal da distribuidora");
        System.out.println("5 - Invertendo a String");

        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                ExercicioUm.ValorDaSoma();
                break;

            case 2:
                System.out.println("Insira o valor que deseja conferir se pertence a Fibonacci: ");
                int valor = scanner.nextInt();
                ExercicioDois.Fibo(valor);
                break;

            case 3:
                ExercicioTres.Vetores();
                break;
            case 4:
                ExercicioQuatro.Faturamento();
                break;
            case 5:
                System.out.println("Insira a palavra que deseja inverter: ");
                scanner.nextLine();

                String palavra = scanner.nextLine();
                ExercicioCinco.InvertendoString(palavra);
            default:
                break;
        }
    }
}