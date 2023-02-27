package edu.br.rpeixoto.Exercicios.set;

import java.util.Comparator;

public class ComparatorNomeAnoDeCriacaoIDE implements Comparator<LinguagemFavorita> {

  @Override
  public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
    int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
    int ano = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
    if (nome != 0) {
      return nome;
    } else if (ano != 0) {
      return ano;
    } else {
      return o1.getIde().compareToIgnoreCase(o2.getIde());
    }
  }

}
