package collections.list;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as numa lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – janeiro, 2 – Fevereiro e etc).
*/


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int count = 1;
        while (count != 7) {
            System.out.println("Digite a temperatura do mês: " + count);
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }

        System.out.println("\nTemperaturas passadas: ");
        temperaturas.forEach(t -> System.out.println(t + " "));

        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\n Média das temperaturas: %.1f \n\n", media);

        System.out.println("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("\n %.1f\n ", t));

        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0) : System.out.printf("1 - Janeiro: %.1f\n", temp);
                    break;
                    case (1) : System.out.printf("2 - Fevereiro: %.1f\n", temp);
                    break;
                    case (2) : System.out.printf("3 - Março: %.1f\n", temp);
                    break;
                    case (3) : System.out.printf("4 - Abril: %.1f\n", temp);
                    break;
                    case (4) : System.out.printf("5 - Maio: %.1f\n", temp);
                    break;
                    case (5) : System.out.printf("6 - Junho: %.1f\n", temp);
                    break;
                    default : System.out.println("Não houve temperatura acima da média.");
                    break;
                }
            }
            count++;
        }

        scan.close();
    }
}