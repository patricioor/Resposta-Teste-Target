package io.github.patriciorios.exercicios.ExercicioQuatro;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

public class ExercicioQuatro {
    public static void Faturamento(){
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            List<Filial> filiais = objectMapper.readValue(
                    new File("D:\\Repositório Estudos\\Java\\projeto-estagio-target-gupy\\src\\main\\java\\io\\github\\patriciorios\\exercicios\\ExercicioQuatro\\data.json"),
                    new TypeReference<>() {
                    });
            double faturamentoTotal = AcumuladoMes(filiais);
            PorcentagemPorFilial(filiais, faturamentoTotal);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static double AcumuladoMes(List<Filial> filiais){
        double acumulado = 0;

        for(Filial filial: filiais){
            acumulado += filial.getFaturamento();
        }
        return acumulado;
    }

    private static void PorcentagemPorFilial(List<Filial> filiais, double acumulado){
        for(Filial filial: filiais){
            double faturamentoUnidade = (filial.getFaturamento()/acumulado*100);
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("O estado: " + filial.getEstado() + " representou " + df.format(faturamentoUnidade) + "% do faturamento total da empresa");
        }
    }
}
