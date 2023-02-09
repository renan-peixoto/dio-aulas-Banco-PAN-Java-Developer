package edu.br.rpeixoto.arrays;

/*Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa. */
public class OrdemInversa {
  public static void main(String[] args) {
    int vetor[] = { -6, 5, 8, 85, 67, 7 };

    int count = 0;
    System.out.println("vetor: ");
    while (count < vetor.length) {
      System.out.print(vetor[count] + " ");
      count++;
    }

    System.out.println("\nvetor: ");
    for (int i = (vetor.length - 1); i >= 0; i--) {
      System.out.print(vetor[i] + " ");
    }
  }
}
