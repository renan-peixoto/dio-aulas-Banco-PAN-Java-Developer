package edu.br.rpeixoto.repeticao;

import java.util.Scanner;

public class Nota {
  /*
   * Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
   * caso o valor seja inválido e continue pedindo até que o usuário informe um
   * valor válido.
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nota;

    while (true) {
      System.out.println("Insira uma nota entre 0 e 10: ");
      nota = scanner.nextInt();
      if (nota >= 0 && nota <= 10) {
        break;
      }
      System.out.println("Insira um valor válido");
    }

    System.out.println("Obrigado pela nota!");

    // Outra forma

    /*
     * System.out.println("Nota");
     * int nota = scanner.nextInt();
     * 
     * while (nota < 0 | nota > 10) {
     * System.out.println("Nota invalida");
     * nota = scanner.nextInt();
     * }
     */

    scanner.close();

  }

}
