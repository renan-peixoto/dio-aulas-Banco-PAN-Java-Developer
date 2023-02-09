package edu.br.rpeixoto.repeticao;

import java.util.Scanner;

/*Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome) */

public class NomeIdade {
  public static void main(String[] args) {
    // ler conjunto de dois valores
    Scanner scanner = new Scanner(System.in);
    String nome;
    int idade;

    while (true) {
      System.out.println("Nome:");
      nome = scanner.next();
      if (nome.equals("0")) { // Se nome for igual a 0 parar a execução
        break;
      }

      System.out.println("idade: ");
      idade = scanner.nextInt();
    }

    scanner.close();
    System.out.println("continua aqui...");
  }

}
