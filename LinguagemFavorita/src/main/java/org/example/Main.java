package org.example;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        LinguagemFavorita instancia = new LinguagemFavorita();

        Set<LinguagemFavorita> listaDeLinguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("JavaScript", 1995, "VS Code"));
            add(new LinguagemFavorita("PHP", 1994, "Eclipse"));
            add(new LinguagemFavorita("Ruby", 1995, "Sublime"));
            add(new LinguagemFavorita("Python", 1991, "VS Code"));
            add(new LinguagemFavorita("Java", 1995, "NetBeans"));
            add(new LinguagemFavorita("SQL", 1976, "MySQL Benchmark"));
        }};

        System.out.println("A. Exiba os objetos em ordem de inserção:");
        instancia.forEachPrint(listaDeLinguagens);

        System.out.println("\nB. Exiba os objetos em ordem natural:");
        Set<LinguagemFavorita> listaDeLinguagensNatural = new TreeSet<>();
        listaDeLinguagensNatural.addAll(listaDeLinguagens);
        instancia.forEachPrint(listaDeLinguagensNatural);

        System.out.println("\nC. Exiba os objetos em ordem pela sua IDE:");
        Set<LinguagemFavorita> listaDeLinguagensIDE = new TreeSet<>(new CompareIde());
        listaDeLinguagensIDE.addAll(listaDeLinguagens);
        instancia.forEachPrint(listaDeLinguagensIDE);

        System.out.println("\nD. Exiba os objetos em ordem pela seu ano de criação e nome:");
        Set<LinguagemFavorita> listaDeLinguagensAnoENome = new TreeSet<>(new CompareAnoENome());
        listaDeLinguagensAnoENome.addAll(listaDeLinguagens);
        instancia.forEachPrint(listaDeLinguagensAnoENome);


        System.out.println("\nE. Exiba os objetos em ordem pela seu nome, ano e IDE:");
        Set<LinguagemFavorita> listaDeLinguagensNomeAnoEIde= new TreeSet<>(new CompareNomeAnoEIde());
        listaDeLinguagensNomeAnoEIde.addAll(listaDeLinguagens);
        instancia.forEachPrint(listaDeLinguagensNomeAnoEIde);
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    @Override
    public int compareTo(LinguagemFavorita l) {
        return this.nome.compareTo(l.getNome());
    }

    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public LinguagemFavorita() {}

    public void forEachPrint(Iterable<LinguagemFavorita> instancia){
        for (LinguagemFavorita l : instancia) {
            System.out.println(l.getNome() + " - " + l.getAnoDeCriacao() + " - " + l.getIde());
        }
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
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

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

}

class CompareIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

class CompareAnoENome implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(ano != 0) return ano;

        return l1.getNome().compareTo(l2.getNome());
    }
}

class CompareNomeAnoEIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;

        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(ano != 0) return ano;

        return l1.getIde().compareTo(l2.getIde());
    }
}