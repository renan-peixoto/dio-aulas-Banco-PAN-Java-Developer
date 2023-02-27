package edu.br.rpeixoto.Exercicios.set;

import java.util.Comparator;

public class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
    int anoDeCriação = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
    if (anoDeCriação != 0) {
      return anoDeCriação;
    }
    return o1.getNome().compareTo(o2.getNome());
  }

}
