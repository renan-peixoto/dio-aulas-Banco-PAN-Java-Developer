package edu.br.rpeixoto.interface1;

public class Calculadora implements OperacoesMatematicas{

    @Override
    public void somar(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Resultador: de %d",(operando1 + operando2)));
    }

    @Override
    public void subtrair(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Resultador: de %d",(operando1 - operando2)));
        
    }

    @Override
    public void multiplicar(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Resultador: de %d",(operando1 * operando2)));

    }

    @Override
    public void dividir(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println(String.format("Resultador: de %d",(operando1 / operando2)));
        
    }
    
}
