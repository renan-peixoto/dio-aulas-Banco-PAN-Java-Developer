package edu.br.rpeixoto.map;

import java.util.*;
import java.util.Map.Entry;

public class ExemploMap {
  public static void main(String[] args) {
    /*
     * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
     * modelo = gol - consumo = 14,4km/l
     * modelo = uno - consumo = 15,6 km/l
     * modelo = mobi - consumo = 16,1 km/l
     * modelo = hb20 - consumo = 14,5 km/l
     * modelo = kwid - consumo = 15,6 km/l
     */

    Map<String, Double> carrosPopulares = new HashMap<>() {
      {
        put("Gol", 14.4);
        put("Uno", 15.6);
        put("Mobi", 16.1);
        put("HB20", 14.5);
        put("Kwid", 15.6);
      }
    };
    System.out.println(carrosPopulares);

    System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
    carrosPopulares.put("Gol", 15.2);
    System.out.println(carrosPopulares);

    System.out.println("\nConfira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

    System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("Uno"));

    System.out.println("\nExiba os modelos: ");
    Set<String> modelos = carrosPopulares.keySet();
    System.out.println(modelos);

    System.out.println("\nExiba os consumos dos carros: ");
    Collection<Double> consumos = carrosPopulares.values();
    System.out.println(consumos);

    System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
    Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

    Set<Entry<String, Double>> entries = carrosPopulares.entrySet();
    String modeloMaisEficiente = "";

    for (Map.Entry<String, Double> entry : entries) {
      if (entry.getValue().equals(consumoMaisEficiente)) {
        modeloMaisEficiente = entry.getKey();
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
      }
    }

    System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
    Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

    Set<Entry<String, Double>> entries2 = carrosPopulares.entrySet();
    String modeloMenosEficiente = "";

    for (Entry<String, Double> entry : entries2) {
      if (entry.getValue().equals(consumoMenosEficiente)) {
        modeloMenosEficiente = entry.getKey();
        System.out.println("Modelomenos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);

      }
    }

    Iterator<Double> iterator = carrosPopulares.values().iterator();
    Double soma = 0d;
    while (iterator.hasNext()) {
      soma += iterator.next();
    }
    System.out.println("Exiba a soma dos consumos: " + soma);

    // Double reduce = carrosPopulares.values().stream()
    // .reduce(0d, (subtotal, element) -> subtotal + element);
    // System.out.println(reduce);

    System.out.println("Exiba a média dos consumos: " + soma / carrosPopulares.size());

    System.out.println("Remova os modelos com consumo igual a 15,6 km/l: ");
    Iterator<Double> iterator1 = carrosPopulares.values().iterator();
    while (iterator1.hasNext()) {
      if (iterator1.next().equals(15.6)) {
        iterator1.remove();
      }
    }
    System.out.println(carrosPopulares);

    System.out.println("Exiba todos os carros na ordem em que foram informados: ");
    Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {
      {
        put("Gol", 14.4);
        put("Uno", 15.6);
        put("Mobi", 16.1);
        put("HB20", 14.5);
        put("Kwid", 15.6);
      }
    };
    System.out.println(carrosPopulares2.toString());

    System.out.println("Exiba o dicionário ordenado pelo modelo: ");
    Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
    System.out.println(carrosPopulares3);
    System.out.println("Apague o dicionario de carros: ");
    carrosPopulares.clear();

    System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

  }

}
