package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando lista de temperaturas e adicionando elementos
        List<Double> temperaturaMediaSemestral = new ArrayList<>();
        temperaturaMediaSemestral.add(31.0);
        temperaturaMediaSemestral.add(24.0);
        temperaturaMediaSemestral.add(27.3);
        temperaturaMediaSemestral.add(25.0);
        temperaturaMediaSemestral.add(27.0);
        temperaturaMediaSemestral.add(26.7);

        // Obtendo a média
        Double mediaSemestral = 0.0;
        for (Double temperatura : temperaturaMediaSemestral) {
            mediaSemestral += temperatura;
        }
        mediaSemestral /= temperaturaMediaSemestral.size();

        // Imprimindo temperaturas acima da média
        List<String> temperaturasAcimaDaMedia = new ArrayList<>();
        List<String> meses = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho");
        for(int i = 0; i < temperaturaMediaSemestral.size(); i++){
            if (temperaturaMediaSemestral.get(i) > mediaSemestral){
                switch(i+1){
                    case 1 -> temperaturasAcimaDaMedia.add((i+1) + " - " + meses.get(i) + ": " + temperaturaMediaSemestral.get(i));
                    case 2 -> temperaturasAcimaDaMedia.add((i+1) + " - " + meses.get(i) + ": " + temperaturaMediaSemestral.get(i));
                    case 3 -> temperaturasAcimaDaMedia.add((i+1) + " - " + meses.get(i) + ": " + temperaturaMediaSemestral.get(i));
                    case 4 -> temperaturasAcimaDaMedia.add((i+1) + " - " + meses.get(i) + ": " + temperaturaMediaSemestral.get(i));
                    case 5 -> temperaturasAcimaDaMedia.add((i+1) + " - " + meses.get(i) + ": " + temperaturaMediaSemestral.get(i));
                    case 6 -> temperaturasAcimaDaMedia.add((i+1) + " - " + meses.get(i) + ": " + temperaturaMediaSemestral.get(i));
                }
            }
        }
        System.out.printf("Temperaturas acima da média semestral: \n" + String.valueOf(temperaturasAcimaDaMedia));
    }
}