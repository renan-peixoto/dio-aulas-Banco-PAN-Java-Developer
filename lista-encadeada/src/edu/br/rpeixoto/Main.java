package edu.br.rpeixoto;

import edu.br.rpeixoto.listaencadeada.ListaEncadeada;

public class Main {
  public static void main(String[] args) {
    ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
    minhaListaEncadeada.add("teste1");
    minhaListaEncadeada.add("teste2");
    minhaListaEncadeada.add("teste3");
    minhaListaEncadeada.add("teste4");

    System.out.println(minhaListaEncadeada.get(0));
    System.out.println(minhaListaEncadeada.get(1));
    System.out.println(minhaListaEncadeada.get(2));
    System.out.println(minhaListaEncadeada.get(3));
    System.out.println(minhaListaEncadeada);
    System.out.println(minhaListaEncadeada.remover(3));
    System.out.println(minhaListaEncadeada);
  }
}
