package edu.br.rpeixoto.map.ordenacaomap;

import java.util.*;
import java.util.Map.Entry;

/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:

exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/
public class ExemploOrdenacaoMap {
  public static void main(String[] args) {
    Map<String, Livro> meusLivros = new HashMap<>() {
      {
        put("Milo DuQuete, Lon", new Livro("Goetia Ilustrada", 158));
        put("Riodan, Rick", new Livro("Magnus Chase", 400));
        put("Rick Riodan", new Livro("Maldição do Titã", 300));
      }
    };
    System.out.println(meusLivros);

    for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println("\n--\tOrdem Inserção\t--");

    Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
      {
        put("Milo DuQuete, Lon", new Livro("Goetia Ilustrada", 158));
        put("Riodan, Rick", new Livro("Magnus Chase", 400));
        put("Rick Riodan", new Livro("Maldição do Titã", 300));
      }
    };
    for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println("\n--\tOrdem alfabética autores\t--");

    Map<String, Livro> meusLivros2 = new TreeMap<>() {
      {
        put("Milo DuQuete, Lon", new Livro("Goetia Ilustrada", 158));
        put("Riodan, Rick", new Livro("Magnus Chase", 400));
        put("Rick Riodan", new Livro("Maldição do Titã", 300));
      }
    };
    for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
      System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }

    System.out.println("--\tOrdem alfabética nomes dos livros\t--");
    Set<Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
    meusLivros3.addAll(meusLivros.entrySet());
    for (Map.Entry<String, Livro> entry : meusLivros3) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
    }

    System.out.println("--\tOrdem número de página\t--");
    Set<Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
    meusLivros4.addAll(meusLivros.entrySet());
    for (Map.Entry<String, Livro> entry : meusLivros4) {
      System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getPaginas());
    }

  }
}
