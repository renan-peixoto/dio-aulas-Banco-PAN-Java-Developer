package edu.br.rpeixoto.heranca;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        // polimorfismo de sobrescrita
        Veiculo carro = new Carro(); // upcasting
        Moto moto1 = new Moto(); // somente a criação de um obj da class Moto
        Veiculo moto2 = new Moto(); // embora o objeto criado seja uma instância de Moto, ele é tratado como um Veiculo no código. Isso ocorre porque a variável moto2 tem o tipo da classe pai e, portanto, só pode acessar as funcionalidades que são comuns a todas as subclasses de Veiculo.

        moto1.andar();
        moto2.andar();

        carro.andar();
        veiculo.andar();

        Carro carro2 = (Carro) new Veiculo(); // downcasting
        carro2.andar();
    }
}
