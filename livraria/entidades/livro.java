package entidades;

public class livro {

    public String livro;
    public String autor;
    public int quantidade;
    public double valorUnit;
    public int emprestalivro;
    public int devolvelivro;

    public String exibeInfo() {
        return "Livro: " + livro +
        "\nAutor: " + autor +
        "\nQuantidade: " + quantidade +
        "\nValor Unitario: " + valorUnit;
    }
    public void emprestalivro(int quantidade){
        this.quantidade -= quantidade;
    }
    public void devolvelivro(int quantidade){
        this.quantidade += quantidade;
    }
}