package edu.br.rpeixoto.repeticao;

import java.util.Scanner;

/*Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo: */
public class Tabuada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número entre 1 e 10");
    int numero = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(String.format("%d x %d = %d", numero, i, numero * i));
    }
    scanner.close();
  }
}
