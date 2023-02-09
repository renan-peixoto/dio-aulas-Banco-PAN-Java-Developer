package edu.br.rpeixoto.repeticao;

import java.util.Scanner;

/*Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares. */

public class ParImpa {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Quantidade de números: ");
    int quantidadeDeNumeros = scan.nextInt();

    int quantidadePar = 0, quantidadeImpar = 0;

    int count = 0;
    do {
      System.out.println("Número: ");
      int numero = scan.nextInt();

      if (numero % 2 == 0) {
        quantidadePar++;
      } else {
        quantidadeImpar++;
      }
      count++;
    } while (count < quantidadeDeNumeros);
    System.out
        .println("Quantidade números pares: " + quantidadePar + " / Quantidade números ímpares: " + quantidadeImpar);

    scan.close();
  }
}
