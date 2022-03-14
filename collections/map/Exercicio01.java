package collections.map;
/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */

import java.util.*;

public class Exercicio01 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoNE = new HashMap<>(){{
            put("Pernambuco", 9649621);
            put("Alagoas", 3351543);
            put("Ceara", 9187103);
            put("Rio grande do Norte", 3534265);
        }};

        System.out.println(populacaoNE);

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        populacaoNE.put("Rio grende do Norte", 3534165);
        System.out.println(populacaoNE);

        System.out.println("\nConfira se o estado da Paraíba (Paraíba) está no dicionário, caso não, adicione: " +
                "Paraíba - 4.039.277: ");
        populacaoNE.put("Paraiba", 4039277);
        System.out.println(populacaoNE);

        System.out.println("\nExiba a população do estado PE: " + populacaoNE.get("Pernambuco"));

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoNE2 = new LinkedHashMap<>(){{
            put("Pernambuco", 9649621);
            put("Alagoas", 3351543);
            put("Ceara", 9187103);
            put("Rio grande do Norte", 3534265);
            put("Paraíba", 4039277);
        }};
        System.out.println(populacaoNE2);

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoNE3 = new TreeMap<>(populacaoNE2);
        System.out.println(populacaoNE3);

        Collection<Integer> populacao = populacaoNE2.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entrada : populacaoNE2.entrySet()) {
            if (entrada.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entrada.getKey();
            if (entrada.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entrada.getKey();
        }

        System.out.printf("\nExiba o estado com o menor população (%s) e seu respectivo valor (%d)\n",
                estadoMenorPopulacao, Collections.min(populacao));
        System.out.printf("\nExiba o estado com a maior população (%s) e seu respectivo valor (%d)\n",
                estadoMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoNE.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
            }
        System.out.println("\nExiba a soma da população desses estados: " + soma);

        System.out.printf("\nExiba a média da população deste dicionário de estados: ", + (soma / populacaoNE.size()));

        System.out.println("\nRemova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoNE.values().iterator();
        while(iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) {
                iterator.remove();
            }
        }

        System.out.println(populacaoNE);


        System.out.println("Confira se a lista está vazia: " + populacaoNE.isEmpty());



        

    }

}
