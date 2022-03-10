package collections.set;

/*Dadas as seguintes informações sobre as minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);

Série 1 = Nome: atypical, genero: drama, tempoEpisodio: 23
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: breaking bad, genero: crime, tempoEpisodio: 45
*/


import java.util.*;

public class ExemploOrdenacaoSet extends Serie {
    public ExemploOrdenacaoSet(String nome, String genero, Integer tempodeEpisodio) {
        super(nome, genero, tempodeEpisodio);
    }

    public static void main(String[] args) {

        System.out.println("\n--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<Serie>() {{
            add(new Serie("Atypical", "Drama", 23));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Breaking Bad", "Criminal", 50));
        }};
        for (Serie serie : minhasSeries)
        System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempodeEpisodio());


        System.out.println("\n--\tOrdem inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("Ozark", "Drama", 25));
            add(new Serie("Naomi", "Drama", 45));
            add(new Serie("What If...", "Fantasia", 23));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempodeEpisodio());


        System.out.println("\n--\tOrdem natural (TempoEpisodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempodeEpisodio());


        System.out.println("\n--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new NomeGeneroTime());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempodeEpisodio());


        System.out.println("\n--\tOrdem gênero\t--");
        Set<Serie> minhasSeries4 = new TreeSet<>(new CompareGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempodeEpisodio());

        System.out.println("\n--\tOrdem Tempo Episódio\t--");
        Set<Serie> minhasSeries5 = new TreeSet<>(new CompareGenero());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie : minhasSeries4)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - " + serie.getTempodeEpisodio());

    }
}

