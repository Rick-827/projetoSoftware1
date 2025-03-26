package poo;

public class principal {
    public static void main(String[] args) {
        contames janeiro = new contames();
        contames fevereiro = new contames();

        //gasto janeiro

        janeiro.Alimentação = 1000;
        janeiro.Luz = 300;
        janeiro.agua = 300;

        //gasto de fevereiro
        fevereiro.Alimentação = 1500;
        fevereiro.Luz = 300;
        fevereiro.agua = 300;

        //Gasto total
        double gastoJan = janeiro.Somagasto();

        double gastofev = fevereiro.Somagasto();

        if(gastoJan > gastofev){
            System.out.println("O gasto em Janeiro foi maior do que em fevereiro");
        }
        else if(gastofev > gastoJan)
            System.out.println("O gasto em fevereiro foi maior do que em Janeiro");
        else {
            System.out.println("ambos tiveram o mesmo gasto");
        }
    }
}
