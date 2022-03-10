package collections.set;

import java.util.Comparator;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {

    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = Integer.valueOf(anoDeCriacao);
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao='" + anoDeCriacao + '\'' +
                ", ide='" + ide + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(String anoDeCriacao) {
        this.anoDeCriacao = Integer.valueOf(anoDeCriacao);
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public int compareTo(LinguagemFavorita linguagensFavoritas) {
        return this.nome.compareTo(linguagensFavoritas.nome);
    }
}

class CompareIde implements Comparator <LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita i1, LinguagemFavorita i2) {
        return i1.ide.compareTo(i2.ide);
    }
}

class CompareAno implements Comparator <LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita a1, LinguagemFavorita a2) {
        int anoDeCriacao = Integer.compare(a1.anoDeCriacao, a2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return a1.nome.compareToIgnoreCase(a2.nome);
    }
}

class CompareNomeIdeAno implements Comparator <LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita a1, LinguagemFavorita a2) {
        int nome = a1.nome.compareToIgnoreCase(a2.nome);
        int anoDeCriacao = Integer.compare(a1.anoDeCriacao, a2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;

        return a1.ide.compareToIgnoreCase(a2.ide);
    }
}
