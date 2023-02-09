package edu.br.rpeixoto.arrays;

import java.util.Random;

/*Array Multidimensional: Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor número da matriz e a sua posição(linha, coluna). */
public class Multidimensional {
  public static void main(String[] args) {
    Random random = new Random();
    int[][] M = new int[4][4];

    int menor = Integer.MAX_VALUE;
    int linha = 0, coluna = 0;

    for (int i = 0; i < M.length; i++) {
      for (int j = 0; j < M[i].length; j++) {
        M[i][j] = random.nextInt(9);

        if (M[i][j] < menor) {
          menor = M[i][j];
          linha = i;
          coluna = j;
        }
      }
    }

    System.out.println("Menor: " + menor);
    System.out.println("Linha: " + linha);
    System.out.println("Coluna: " + coluna);

    System.out.println("\nMatriz");
    for (int[] linhaM : M) {
      for (int colunaM : linhaM) {
        System.out.print(colunaM + " ");
      }
      System.out.println();
    }
  }
}
