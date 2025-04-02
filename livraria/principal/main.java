package principal;

import java.util.Scanner;

import entidades.livro;

public class main {

    public static void main(String[] args) {
        livro culpaDasEstrelas= new livro();
        Scanner jc = new Scanner(System.in);

        culpaDasEstrelas.livro = "A Culpa e Das Estrelas";
        culpaDasEstrelas.autor = "John Green";
        culpaDasEstrelas.quantidade = 100;
        culpaDasEstrelas.valorUnit = 80;

        System.out.println("informe a quantidade de livros emprestado: ");
        int quantidade = jc.nextInt();
        culpaDasEstrelas.emprestalivro(quantidade);

        System.out.println("informe a quantidade de livros devolvidos: ");
        quantidade = jc.nextInt();
        culpaDasEstrelas.devolvelivro(quantidade);

        System.out.println(culpaDasEstrelas.exibeInfo());
        jc.close();
        
    }
}