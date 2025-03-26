package orientação;

public class Carro {

    double motor;
    String fabricante;
    String modelo;
    int ano;
    String placa;
    String cor;
    int velocidade;

    public void exibirInfo() {
        System.out.println(
        "\nFabricante: " + fabricante +
        "\nModelo: " + modelo +
        "\ncor: " + cor +
        "\nano: " + ano +
        "\nplaca: " + placa +
        "\nmotor: " + motor +
        "\nvelocidade: " + velocidade 
        );
    }

    public void acelera(int vel) {
        velocidade = velocidade + vel;
    }

    public void freio(int freia) {
        velocidade = velocidade - freia;
    }
    
}
