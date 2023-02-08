package edu.br.rpeixoto.tiposevariaveis;

public class TiposVariaveis {
    /**
     * Tipos primitivos, variaveis e constantes
     * 
     */
    public static void main(String[] args) {
        // VARIAVEIS
        System.out.println("**** VARIAVEIS ****");

        byte idade = 123;
        System.out.println(idade);
        idade = 121; // variaveis podem mudar de valor
        System.out.println(idade);

        short ano = 2021;
        System.out.println(ano);

        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        System.out.println(cep);

        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        System.out.println(cpf);

        double salario = 1275.33;
        System.out.println(salario);

        // CONSTANTES - CAIXA ALTA e com a palavra reservada final
        System.out.println("\n **** CONSTANTES ****");

        final float VALOR_DE_PI = 3.14F;
        System.out.println(VALOR_DE_PI);

        // Não é um tipo primitivo e sim uma classe utilizada para textos.
        System.out.println("\n **** CLASSE STRING ****");

        String meuNome = "Renan";
        System.out.println(meuNome);

    }
}
