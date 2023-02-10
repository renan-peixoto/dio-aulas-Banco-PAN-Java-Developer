package edu.br.rpeixoto.pilha;

public class Main {
  public static void main(String[] args) {
    Pilha minhaPilha = new Pilha();
    minhaPilha.colocar(new No(1));
    minhaPilha.colocar(new No(2));
    minhaPilha.colocar(new No(3));
    minhaPilha.colocar(new No(4));
    minhaPilha.colocar(new No(5));
    minhaPilha.colocar(new No(6));

    System.out.println(minhaPilha);

    System.out.println(minhaPilha.tirar());
    System.out.println(minhaPilha);

  }
}
