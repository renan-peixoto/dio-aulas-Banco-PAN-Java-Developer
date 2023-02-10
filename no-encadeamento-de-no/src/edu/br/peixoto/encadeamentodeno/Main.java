package edu.br.peixoto.encadeamentodeno;

public class Main {
  public static void main(String[] args) {
    No<String> no1 = new No<>("Primeiro Nó");
    No<String> no2 = new No<>("Segundo Nó");
    No<String> no3 = new No<>("Terceiro Nó");
    no1.setProximoNo(no2);
    no2.setProximoNo(no3);

    System.out.println(no1);
    System.out.println(no1.getProximoNo());
    System.out.println(no1.getProximoNo().getProximoNo());
  }
}
