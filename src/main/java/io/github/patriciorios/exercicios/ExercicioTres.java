package io.github.patriciorios.exercicios;

import java.util.Random;

public class ExercicioTres {
    public static void Vetores(){
        Random random = new Random();
        int somatorio = 0;
        int diasFaturamentoMaior = 0;
        int maiorValor = 0;
        int menorValor = Integer.MAX_VALUE;
        int[] mes = new int[30];

        System.out.print("Faturamento: (");

        for(int i = 0; i < mes.length; i++){
            mes[i] = random.nextInt(40 + 1) +10;
            somatorio += mes[i];
            if(maiorValor < mes[i]){
                maiorValor = mes[i];
            }
            if(menorValor> mes[i]){
                menorValor = mes[i];
            }
            System.out.print(mes[i]);
            if(i != mes.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(")");

        for(int numero: mes){
            if(numero > (somatorio/mes.length)){
                diasFaturamentoMaior++;
            }
        }

        System.out.println("Menor faturamento ocorrido no mes: R$ " + menorValor + ",00");
        System.out.println("Maior faturamento ocorrido no mes: R$ " + maiorValor + ",00");

        System.out.println("Numero de dias no mes em que o valor de faturamento diario foi superior a media mensal: " + diasFaturamentoMaior);
    }
}
