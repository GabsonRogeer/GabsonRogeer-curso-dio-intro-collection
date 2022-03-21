package collections.streamAPI;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "8", "6", "5");

        /*System.out.println("Imprima todos os elementos dessa lista de String: ");

        numerosAleatorios.forEach(System.out::println);*/

        /*System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);*/

        /*System.out.println("Transfome esta lista de String numa lista de números inteiros.");
        numerosAleatorios.stream()
                .map(Integer::parseInt).toList()
                .forEach(System.out::println);*/

        System.out.println("Pegue os números pares e maiores que 2 e coloque-os em uma lista: ");
        List<Integer> listParesMaiorQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i %2 == 0 && i > 2 )
                .collect(Collectors.toList());
        System.out.println(listParesMaiorQue2);

        System.out.println("Mostrar média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        List<Integer> numAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numAleatoriosInteger.removeIf(i -> (i % 2 !=0));
        System.out.println(numAleatoriosInteger);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);


        long countNumerosUnicos = numAleatoriosInteger.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("\nMostre o menor valor da lista: ");
        numAleatoriosInteger
                .stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);
        }
    }
