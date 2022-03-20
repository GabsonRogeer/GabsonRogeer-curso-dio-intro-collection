package collections.streamAPI;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "8", "6", "5");

        /*System.out.println("Imprima todos os elementos dessa lista de String: ");

        numerosAleatorios.forEach(System.out::println);*/

        /*System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);*/

        /*System.out.println("Transfome esta lista de String em uma lista de números inteiros.");
        numerosAleatorios.stream()
                .map(Integer::parseInt).toList()
                .forEach(System.out::println);*/

        System.out.println();


    }
}
