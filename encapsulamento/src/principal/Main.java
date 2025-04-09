package principal;

import ContaBancaria;

public class Main {
    public static void main(String[] args) {

        ContaBancaria joao = new ContaBancaria("João",1000);
        //aces
        System.out.println(joao.saldo);
        //Alter
        joao.saldo = 30000;

        System.out.println("titular: " + joao.getTitular());
        System.out.println("Saldo: " + joao.getSaldo());

        joao.setTitular("João Kbler");
        joao.setSaldo(5000);

        System.out.println(joao.toString());




    }
    

}