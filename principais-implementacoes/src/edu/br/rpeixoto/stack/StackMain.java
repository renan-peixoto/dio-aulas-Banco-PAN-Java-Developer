package edu.br.rpeixoto.stack;

import java.util.Stack;

import edu.br.rpeixoto.equalshashcode.Carro;

public class StackMain {
    public static void main(String[] args) {
        Stack<Carro> stackDeCarro = new Stack<>();

        stackDeCarro.add(new Carro("Ford"));
        stackDeCarro.add(new Carro("Hyundai"));
        stackDeCarro.add(new Carro("Honda"));

        System.out.println(stackDeCarro);
        System.out.println(stackDeCarro.pop());
    }
}
