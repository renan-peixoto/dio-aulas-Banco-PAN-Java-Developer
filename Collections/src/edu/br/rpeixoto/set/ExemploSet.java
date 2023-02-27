package edu.br.rpeixoto.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
  public static void main(String[] args) {
    System.out.println("Crie um conjunto e adicione as notas: ");
    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    System.out.println(notas.toString());

    // System.out.println("Exiba a posição da nota 5.0: ");

    System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

    System.out.println("Exiba a menor nota: " + Collections.min(notas));

    System.out.println("Exiba a maior nota: " + Collections.max(notas));

    Iterator<Double> itarador = notas.iterator();
    Double soma = 0.0;
    while (itarador.hasNext()) {
      Double next = itarador.next();
      soma += next;
    }
    System.out.println("Exiba a soma dos valores: " + soma);

    System.out.println("Exiba a média dos valores: " + soma / notas.size());

    System.out.println("Remova a nota 0: ");
    notas.remove(0d);
    System.out.println(notas);

    System.out.println("Remova as notas menores que 7");
    Iterator<Double> iterator1 = notas.iterator();
    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      if (next < 7) {
        iterator1.remove();
      }
    }
    System.out.println(notas);

    System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
    Set<Double> notas2 = new LinkedHashSet<>() {
      {
        add(7d);
        add(8.5);
        add(9.3);
        add(5d);
        add(7d);
        add(0d);
        add(3.6);
      }
    };
    System.out.println(notas2);

    System.out.println("Exiba todas as notas em ordem crescente: ");
    Set<Double> notas3 = new TreeSet<>(notas2);
    System.out.println(notas3);

    System.out.println("Apague todo o conjunto: ");
    notas.clear();

    System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
    System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
  }

}
