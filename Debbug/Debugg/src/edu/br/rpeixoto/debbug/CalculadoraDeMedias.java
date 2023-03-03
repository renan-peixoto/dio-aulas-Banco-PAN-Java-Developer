package edu.br.rpeixoto.debbug;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

        int media = calcularMediaDaTurma(alunos, scan);
        System.out.printf("Média da turma %d", media);
    }

    private static int calcularMediaDaTurma(String[] alunos, Scanner scan) {
        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s", aluno);
            int nota = scan.nextInt();
            soma += nota;

        }
        return soma / alunos.length;
    }
}
