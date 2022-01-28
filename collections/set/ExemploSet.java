package collections.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {


        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 3.4));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a mior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: " );
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores é de: " + soma);

        System.out.println("Exima a média das notas: " + (soma/ notas.size()));

        System.out.println("Remova a nota 0; ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        notas.removeIf(next -> next < 7);

        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(8d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confiar se o conjunto está vazio " + true);
        System.out.println("Confiar se o conjunto 2 está vazio " + notas2.isEmpty());
        System.out.println("Confiar se o conjunto 3 está vazio " + notas3.isEmpty());

    }
}
