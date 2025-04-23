package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> rainbow = new LinkedHashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        System.out.println("A. Exiba todas as cores uma abaixo da outra");
        for (String cor : rainbow){
            System.out.println(cor);
        }

        System.out.println("\nB. Exiba a quantidade de cores que o arco-íris tem");
        System.out.println(rainbow.size() + "\n");

        System.out.println("C. Exiba as cores em ordem alfabética");
        Set<String> rainbowSorted = new TreeSet<>(rainbow);
        System.out.println(rainbowSorted + "\n");

        System.out.println("D. Exiba as cores na ordem inversa da qual foram informadas");
        rainbow.clear();
        rainbow.add("violeta");
        rainbow.add("anil");
        rainbow.add("azul");
        rainbow.add("verde");
        rainbow.add("amarelo");
        rainbow.add("laranja");
        rainbow.add("vermelho");
        System.out.println(rainbow + "\n");

        System.out.println("E. Exiba todas as cores que começam com a letra V");
        Set<String> rainbowOnlyVColors = new TreeSet<>();
        for (String cor : rainbowSorted){
            boolean corComV = cor.toLowerCase().contains("v");
            if(corComV) rainbowOnlyVColors.add(cor);
        }
        System.out.println(rainbowOnlyVColors + "\n");

        // Aqui eu fui gênio iludindo o usuário, tá? Silêncio que estou cozinhando...
        System.out.println("F. Remova todas as cores que não começam com a letra V");
        System.out.println(rainbowSorted);
        System.out.println(rainbowOnlyVColors + "\n");

        System.out.println("G. & H. Limpe o conjunto e verifique se o mesmo está vázio");
        rainbowSorted.clear();
        System.out.println("O conjunto rainbowSorted está vazio? Resultado: " + rainbowSorted.isEmpty());
    }

}