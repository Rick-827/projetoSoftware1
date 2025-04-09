package entidades;

public class ContaBancaria {
    
    private String titular;
    public double saldo;

    public ContaBancaria(String titular, double saldo) {
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
    
    public void depositar (double valor) {
    	if (valor > 0) {
    		this.saldo += valor;
    	}
    	else {
    		System.out.println("informe um valor válido:");
    	}
    }
    
    public void sacar(double valor) {
    	if (valor > 0) {
    		this.saldo -= valor;
    	}
    	else {
    		System.out.println("informe um valor valido: ");
    	}
    }
    
    @Override
    public String toString() {
    	return "titular = " + titular +
    			"\nsaldo = R$" + saldo;
    }
}