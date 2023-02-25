package edu.br.rpeixoto.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.br.rpeixoto.list.outrasClasses.ComparatorCor;
import edu.br.rpeixoto.list.outrasClasses.ComparatorIdade;
import edu.br.rpeixoto.list.outrasClasses.ComparatorNomeCorIdade;
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

    System.out.println("--\tOrdem de inserção\t---");
    System.out.println(meusGatos);

    System.out.println("--\tOrdem Aleatória\t---");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    System.out.println("--\tOrdem de Natural (Nome)\t---");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    System.out.println("--\tOrdem de Idade\t---");
    // meusGatos.sort(new ComparatorIdade());
    Collections.sort(meusGatos, new ComparatorIdade());
    System.out.println(meusGatos);

    System.out.println("--\tOrdem de Cor\t---");
    meusGatos.sort(new ComparatorCor());
    System.out.println(meusGatos);
    
    System.out.println("--\tOrdem de Nome/Cor/Idade\t---");
    meusGatos.sort(new ComparatorNomeCorIdade());
  }
}
