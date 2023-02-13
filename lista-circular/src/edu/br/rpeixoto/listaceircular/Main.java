package edu.br.rpeixoto.listaceircular;

public class Main {
  public static void main(String[] args) {
    ListaCircular<String> minhaLista = new ListaCircular<>();
    minhaLista.add("Primeira");
    minhaLista.add("Segundo");
    minhaLista.add("terceiro");
    minhaLista.add("quarto");
    minhaLista.add("quinto");
    System.out.println(minhaLista);
    minhaLista.remove(2);
    System.out.println(minhaLista);
  }
}
