package edu.br.rpeixoto.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.br.rpeixoto.list.outrasClasses.Gato;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

public class ExemploOrdenacaoList {
  public static void main(String[] args) {
    List<Gato> meusGatos = new ArrayList<>() {
      {
        add(new Gato("Peter", 5, "preto"));
        add(new Gato("Nicko", 4, "preto-branco"));
        add(new Gato("Mancinho", 7, "amarelo"));
      }
    };

    System.out.println("\n--\tOrdem de inserção\t---");
    meusGatos.stream().forEach(System.out::print);
    // System.out.println(meusGatos);

    System.out.println("\n--\tOrdem Aleatória\t---\n");

    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    System.out.println("\n--\tOrdem de Natural (Nome)\t---");
    meusGatos.stream().sorted().forEach(System.out::print);
    // Collections.sort(meusGatos);
    // System.out.println(meusGatos);

    System.out.println("\n--\tOrdem de Idade\t---");
    meusGatos.stream()
        .sorted(Comparator.comparing(Gato::getIdade))
        .forEach(System.out::print);
    // meusGatos.sort(new ComparatorIdade());
    // Collections.sort(meusGatos, new ComparatorIdade());
    // System.out.println(meusGatos);

    System.out.println("\n--\tOrdem de Cor\t---");
    meusGatos.stream()
        .sorted(Comparator.comparing(Gato::getCor))
        .forEach(System.out::print);
    // meusGatos.sort(new ComparatorCor());
    // System.out.println(meusGatos);

    System.out.println("\n--\tOrdem de Nome/Cor/Idade\t---");
    meusGatos.stream()
        .sorted(Comparator.comparing(Gato::getNome)
            .thenComparing(Gato::getCor)
            .thenComparingInt(Gato::getIdade))
        .forEach(System.out::print);
    // meusGatos.sort(new ComparatorNomeCorIdade());
  }
}
