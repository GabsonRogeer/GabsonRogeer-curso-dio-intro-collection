package collections.set;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção; OK
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/


import java.util.*;

public class ExercicioSet02 {

    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagensFavoritas = new HashSet<>();
        linguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Intellij"));
        linguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "Vscode"));
        linguagensFavoritas.add(new LinguagemFavorita("TypeScript", 2012, "WebStorm"));
        linguagensFavoritas.add(new LinguagemFavorita("Ruby", 1996, "RubyMine"));

        System.out.println("\n--------\tOrdem de Inserção\t--------");
        Set<LinguagemFavorita> linguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Java", 1991, "Intellij"),
                        new LinguagemFavorita("JavaScript", 1995, "Vscode"),
                        new LinguagemFavorita("TypeScript", 2012, "WebStorm"),
                        new LinguagemFavorita("Ruby", 1996, "RubyMine")
                )
        );
        for (LinguagemFavorita linguagem: linguagensFavoritas1) System.out.println(linguagem);

        System.out.println("\n--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFavorita> linguagensFavoritas2 = new TreeSet<>(linguagensFavoritas1);
        for (LinguagemFavorita linguagem: linguagensFavoritas2) System.out.println(linguagem);

        System.out.println("\n--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> linguagensFavoritas3 = new TreeSet<>(new CompareIde());
        linguagensFavoritas3.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem : linguagensFavoritas3) System.out.println(linguagem);

        System.out.println("\n--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> linguagensFavoritas4 = new TreeSet<>(new CompareAno());
        linguagensFavoritas4.addAll(linguagensFavoritas);
        for (LinguagemFavorita linguagem : linguagensFavoritas4) System.out.println(linguagem);

        System.out.println("\n--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> linguagensFavoritas5 = new TreeSet<>(new CompareNomeIdeAno());
        linguagensFavoritas5.addAll(linguagensFavoritas1);
        for (LinguagemFavorita linguagem : linguagensFavoritas5) System.out.println(linguagem);



    }
}