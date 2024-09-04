package io.github.patriciorios.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExercicioCinco {
    public static void InvertendoString(String palavra){
        char[] palavraDesmembrada = palavra.toCharArray();
        List<Character> palavraInvertida = new ArrayList<>();
        String novaPalavra = "";
        for(int i = 0; i < palavraDesmembrada.length; i++){
            palavraInvertida.add(palavraDesmembrada[(palavraDesmembrada.length-1) - i]);
        }

        for(Character letra: palavraInvertida){
            novaPalavra = novaPalavra.concat(String.valueOf(letra));
        }

        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + novaPalavra);

    }
}
