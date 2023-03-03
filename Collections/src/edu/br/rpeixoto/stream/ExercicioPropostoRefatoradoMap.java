package edu.br.rpeixoto.stream;

import java.util.*;
import java.util.stream.Collectors;

import edu.br.rpeixoto.map.Exercicios.map.Contato;

/*Dadas as seguintes informações  de id e contato, crie um dicionário e
ordene este dicionário exibindo (Nome id - Nome contato);
id = 1 - Contato = nome: Simba, numero: 2222;
id = 4 - Contato = nome: Cami, numero: 5555;
id = 3 - Contato = nome: Jon, numero: 1111;
*/

public class ExercicioPropostoRefatoradoMap {

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {
            {
                put(1, new Contato("Simba", 5555));
                put(4, new Contato("Cami", 1111));
                put(3, new Contato("Jon", 2222));
            }
        };
        agenda.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue().getNome()));

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {
            {
                put(1, new Contato("Simba", 5555));
                put(4, new Contato("Cami", 1111));
                put(3, new Contato("Jon", 2222));
            }
        };
        agenda1.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue().getNome()));

        System.out.println("--\tOrdem id\t--");

        Map<Integer, Contato> collect = agenda.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (chave, valor) -> chave,
                        TreeMap::new));

        collect.forEach((chave, valor) -> System.out.println(chave + " - " + valor.getNumero()));

        System.out.println("--\tOrdem número telefone\t--");
        // precisamos organizar os valores. Logo:

        /*
         * Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new
         * Comparator<Map.Entry<Integer, Contato>>() {
         * 
         * @Override
         * public int compare(Entry<Integer, Contato> o1, Entry<Integer, Contato> o2) {
         * return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
         * }
         * 
         * });
         */

        /*
         * Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
         * new Function<Map.Entry<Integer, Contato>, Integer>() {
         * 
         * @Override
         * public Integer apply(Entry<Integer, Contato> t) {
         * return t.getValue().getNumero();
         * }
         * 
         * }));
         */
        System.out.println("-----------------");
        agenda.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingInt(Contato::getNumero)))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue().getNumero()));
        // .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) ->
        // e1, TreeMap::new));

        // collect2.forEach(
        // (chave, valor) -> System.out.println(valor.getNumero() + ": " +
        // valor.getNome()));

        System.out.println("--\tOrdem nome contato\t--");
        // precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set1) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}
