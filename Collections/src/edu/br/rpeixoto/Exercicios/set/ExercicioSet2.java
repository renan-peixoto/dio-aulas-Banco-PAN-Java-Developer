package edu.br.rpeixoto.Exercicios.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet2 {
  public static void main(String[] args) {
    Set<LinguagemFavorita> linguagemFavorita = new LinkedHashSet<>() {
      {
        add(new LinguagemFavorita("javascript", 1995, "vscode"));
        add(new LinguagemFavorita("typescript", 2012, "vscode"));
        add(new LinguagemFavorita("java", 1991, "vscode"));
      }
    };
    System.out.println("Ordem de inserção: " + linguagemFavorita);

    Set<LinguagemFavorita> linguagemFavorita2 = new TreeSet<>(linguagemFavorita);

    System.out.println("\nOrdem natural (nome): " + linguagemFavorita2);

    Set<LinguagemFavorita> linguagemFavorita3 = new TreeSet<>(new ComparatorIDE()) {
      {
        addAll(linguagemFavorita);
      }
    };
    linguagemFavorita3.forEach(e -> System.out.println("\nOrdem natural (IDE) " + e));

    Set<LinguagemFavorita> linguagemFavorita4 = new TreeSet<>(new ComparatorAnoDeCriacaoNome()) {
      {
        addAll(linguagemFavorita);
      }
    };
    System.out.println("\n Ordem natural (Ano de criação/ nome) " + linguagemFavorita4);

    Set<LinguagemFavorita> linguagemFavorita5 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIDE()) {
      {
        addAll(linguagemFavorita);

      }
    };
    linguagemFavorita5.forEach(linguagem -> System.out.println(linguagem));

  }
}
