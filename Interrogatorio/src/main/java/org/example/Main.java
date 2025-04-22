package org.example;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> perguntas = List.of(
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        );

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            if (coletarResposta(scanner, pergunta).equalsIgnoreCase("S")) {
                respostasPositivas++;
            }
        }

        System.out.print("Classificação: ");
        if (respostasPositivas == 0 || respostasPositivas == 1) {
            System.out.println("Inocente");
        } else if (respostasPositivas == 2) {
            System.out.println("Suspeito");
        } else if (respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else {
            System.out.println("Assassino");
        }

        scanner.close();
    }

    private static String coletarResposta(Scanner scanner, String pergunta) {
        while (true) {
            System.out.println(pergunta + " (S/N)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("N")) {
                return resposta;
            } else {
                System.out.println("Digite uma opção válida (S/N).");
            }
        }
    }
}
