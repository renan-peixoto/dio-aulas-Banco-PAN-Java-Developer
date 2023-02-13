package edu.br.rpeixoto.noduplo;

public class Main {
  public static void main(String[] args) {
    ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
    minhaLista.add("primeiro");
    minhaLista.add("segundo");
    minhaLista.add("terceiro");
    minhaLista.add("quarto");
    minhaLista.add("quinto");
    System.out.println(minhaLista);

    minhaLista.add(2, "intrometido");
    System.out.println(minhaLista);

    minhaLista.remove(2);
    System.out.println(minhaLista);
    System.out.println(minhaLista.size());
    System.out.println(minhaLista.get(2));

  }
}
