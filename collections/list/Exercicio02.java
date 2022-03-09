package collections.list;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
        List<String> respostas;
        respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("------------ Interrogatorio ------------");
        System.out.println("----------------------------------------");

        System.out.println("\n------ 1. Telefonou para a vítima? -----");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n----- 2. Esteve no local do crime? -----");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n------- 3. Mora perto da vítima? -------");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n------- 4. Devia para a vítima? --------");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n---- 5. Já trabalhou com a vítima? -----");

        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        for (String resp : respostas) {
            if (resp.contains("s")) {
                count++;
            }
        }

        switch (count) {
            case 2 : System.out.println("\n------------- SUSPEITA!!! -------------");
            case 3 : System.out.println("\n------------- CÚMPLICE!!! --------------");
            case 4 : System.out.println("\n------------- CÚMPLICE!!! --------------");
            case 5 : System.out.println("\n------------- ASSASSINO!!! ------------");
            default : System.out.println("\n-------------   INOCENTE   ------------");
        }

        System.out.println("----------------------------------------");
        System.out.println("--------------   FIM DO   --------------");
        System.out.println("------------ INTERROGATORIO ------------");
        System.out.println("----------------------------------------");

        scanner.close();
    }
}
