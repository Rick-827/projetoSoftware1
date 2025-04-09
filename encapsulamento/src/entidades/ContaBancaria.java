package entidades;

public class ContaBancaria {
    
    private String titular;
    public double saldo;

    public Conta_Bancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // getters - Alter the value

    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }

    //Setters - Alter the value

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}