package edu.br.rpeixoto.set.ordenacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
  public static void main(String[] args) {
    System.out.println("Ordem Aleatória: ");
    Set<Serie> minhasSeries = new HashSet<>() {
      {
        add(new Serie("Sr. Rainha", "romance", 60));
        add(new Serie("Alquimia das Almas", "fantasia", 60));
        add(new Serie("Grey's Anatomy", "drama", 60));
        add(new Serie("Heartstopper", "romance", 25));
      }
    };
    minhasSeries.forEach(e -> System.out.println(e.getNome() + " - " + e.getGenero() + " - " + e.getTempoEpisodio()));

    System.out.println("\nOrdem de Inserção: ");

    Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
      {
        add(new Serie("Sr. Rainha", "romance", 60));
        add(new Serie("Alquimia das Almas", "fantasia", 60));
        add(new Serie("Grey's Anatomy", "drama", 60));
        add(new Serie("Heartstopper", "romance", 25));
      }
    };
    minhasSeries1.forEach(e -> System.out.println(e.getNome() + " - " + e.getGenero() + " - " + e.getTempoEpisodio()));

    System.out.println("\nOrdem natural (tempo de episodio): ");
    Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
    minhasSeries2.forEach(e -> System.out.println(e.getNome() + " - " + e.getGenero() + " - " + e.getTempoEpisodio()));

    System.out.println("\nOrdem Nome/Genero/TempoDeEpisidio: ");
    Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio()) {
      {
        addAll(minhasSeries);
      }
    };
    minhasSeries3.forEach(e -> System.out.println(e.getNome() + " - " + e.getGenero() + " - " + e.getTempoEpisodio()));

  }
}
