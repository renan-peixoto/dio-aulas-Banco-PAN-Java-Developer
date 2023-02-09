package edu.br.rpeixoto.repeticao;

import java.util.Scanner;

/*Faça um programa que leia 5 números e informe o maior número e a média desses números. Do while */
public class MaiorMedia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero;
    int maior = 0;
    int soma = 0;
    int count = 0;

    do {
      System.out.println("Insina o número");
      numero = scanner.nextInt();
      soma += numero;

      if (numero > maior) {
        maior = numero;
      }
      count++;
    } while (count < 5);

    System.out.println("maior número: " + maior);
    System.out.println("Média: " + (soma / 5));

    scanner.close();
  }

}
