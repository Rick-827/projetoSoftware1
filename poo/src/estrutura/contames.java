package estrutura;

public class contames {
    public static void main(String[] args) {
        double janAlim, janAgua, JanLuz, fevAlim, fevAgua, fevLuz;

        //gastos em janeiro
        janAlim = 1000;
        janAgua = 300;
        JanLuz = 300;

        //gastos em Fevereiro
        fevAlim = 1500;
        fevAgua = 300;
        fevLuz = 300;

        //gasto total 

        double gastoTotalJan = janAgua + janAlim + JanLuz;
        double gastoTotalFev = fevAgua + fevAlim + fevLuz;

        if (gastoTotalJan > gastoTotalFev) {
            System.out.println("O gasto de Janeiro foi maior");
        }
        else if (gastoTotalFev > gastoTotalJan) {
            System.out.println("O gasto total de Fevereiro foi maior");
        }
        else{
            System.out.println("Ambos os meses tiveram o mesmo gasto");
        }
    }
}
