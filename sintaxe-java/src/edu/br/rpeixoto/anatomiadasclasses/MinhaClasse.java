package edu.br.rpeixoto.anatomiadasclasses;

public class MinhaClasse {

  public static void main(String[] args) {

    System.out.println("Olá! Seja bem vindo!");
    // variaveis

    String primeiroNome = "Renan";
    String segundoNome = "Peixoto";
    // chamada do método
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

  }

  // metodos
  // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}
