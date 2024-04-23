package exercicio4;

public class ContaBancaria {
    
    private double saldo = 0;

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public void sacar(double saldo){
        this.saldo -= saldo;
    }
}