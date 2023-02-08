package edu.br.rpeixoto.metodos;

public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("TV ligada? " + smartTv.ligada);
    System.out.println("Canal atual: " + smartTv.canal);
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo status : TV ligada? " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("Novo status : TV ligada? " + smartTv.ligada);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.mudarDeCanal(5);
    System.out.println("Canal antes: " + smartTv.canal);
    smartTv.aumentarCanal();
    smartTv.aumentarCanal();
    smartTv.diminurCanal();
    System.out.println("Canal atual: " + smartTv.canal);
  }

}
