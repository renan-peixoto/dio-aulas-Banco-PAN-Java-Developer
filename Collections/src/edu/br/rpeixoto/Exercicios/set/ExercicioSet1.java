package edu.br.rpeixoto.Exercicios.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioSet1 {
  public static void main(String[] args) {
    System.out.println("Exiba todas as cores uma embaixo da outra: ");
    Set<String> coresArcoIris = new HashSet<>() {
      {
        add("vermelho");
        add("laranja");
        add("amarelo");
        add("verde");
        add("azul");
        add("anil");
        add("violeta");
        forEach(cor -> System.out.println(cor));

      }
    };
    System.out.println("\nO arco iris tem " + coresArcoIris.size() + " cores.");

    System.out.println("\nExibir em ordem alfabética: ");

    Set<String> coresArcoIrisOrdemAlfabetica = new TreeSet<>(coresArcoIris);
    coresArcoIrisOrdemAlfabetica.forEach(cor -> System.out.println(cor));

    System.out.println("\nExibir na ordem inversa: ");
    Set<String> coresArcoIris3 = new LinkedHashSet<>() {
      {
        add("vermelho");
        add("laranja");
        add("amarelo");
        add("verde");
        add("azul");
        add("anil");
        add("violeta");
      }
    };

    LinkedList<String> coresDoArcoIrisList = new LinkedList<>(coresArcoIris3);
    Iterator<String> iterator = coresDoArcoIrisList.descendingIterator();
    LinkedHashSet<Object> ordemInversa = new LinkedHashSet<>();

    while (iterator.hasNext()) {
      ordemInversa.add(iterator.next());
    }
    System.out.println(ordemInversa);

    System.out.println("\nExiba todas as cores que começam com a letra ”v”: ");
    coresArcoIris.forEach(cor -> {
      if (cor.startsWith("v"))
        System.out.println(cor);
    });

    System.out.println("\nRemova todas as cores que não começam com a letra “v”: ");

    Iterator<String> iterator2 = coresArcoIris.iterator();
    while (iterator2.hasNext()) {
      if (!iterator2.next().startsWith("v")) {
        iterator2.remove();
      }
    }
    System.out.println(coresArcoIris);

    System.out.println("Limpe o conjunto: ");
    coresArcoIris.clear();

    System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());

  }

}
