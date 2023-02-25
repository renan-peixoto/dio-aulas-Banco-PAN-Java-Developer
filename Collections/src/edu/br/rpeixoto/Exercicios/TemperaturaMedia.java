package edu.br.rpeixoto.Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturaMedia {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Double> temperaturaSemestrel = new ArrayList<>();

    double soma = 0.0;
    for (int i = 1; i <= 6; i++) {
      System.out.print("Qual a temperatura do mês " + i + " : ");
      double temp = scan.nextDouble();
      temperaturaSemestrel.add(temp);
      soma += temp;
    }
    scan.close();

    double mediaTemperaturaSemestral = soma / temperaturaSemestrel.size();

    System.out.println("Temperatura Semestral: " + temperaturaSemestrel);
    System.out.println("Média temperatura Semestral: " + mediaTemperaturaSemestral);
    System.out.println("-----------------");

    for (Double temp : temperaturaSemestrel) {
      if (temp > mediaTemperaturaSemestral) {
        int index = temperaturaSemestrel.indexOf(temp);
        switch (index) {
          case 0:
            System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
            break;
          case 1:
            System.out.println((index + 1) + " - FEVEREIRO: " + temp + " oC");
            break;
          case 2:
            System.out.println((index + 1) + " - MARÇO: " + temp + " oC");
            break;
          case 3:
            System.out.println((index + 1) + " - ABRIL: " + temp + " oC");
            break;
          case 4:
            System.out.println((index + 1) + " - MAIO: " + temp + " oC");
            break;
          case 5:
            System.out.println((index + 1) + " - JUNHO: " + temp + " oC");
            break;
          default:
            break;
        }
      }
    }
  }

}