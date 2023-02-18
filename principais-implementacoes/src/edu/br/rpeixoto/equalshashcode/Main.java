package edu.br.rpeixoto.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<Carro>();

        listaCarros.add(new Carro("chevrolet"));
        listaCarros.add(new Carro("Hyundai"));
        listaCarros.add(new Carro("Honda"));
        listaCarros.add(new Carro("Mercedes"));

        System.out.println("=====================");
        System.out.println(listaCarros);

        System.out.println(listaCarros.contains(new Carro("Hyundai")));
        System.out.println(new Carro("Hyundai").hashCode()); //  possui o  msm hash
        System.out.println(new Carro("Hyundai").hashCode());

        Carro carro1 = new Carro("ford");
        Carro carro2 = new Carro("hyundai");
        System.out.println(carro1.equals(carro2));
    }
}
