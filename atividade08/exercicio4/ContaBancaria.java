package exercicio4;

public class ContaBancaria {
    
    private double saldo;

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public void sacar(double saldo) throws SaldoInsuficienteException{

        if(saldo>this.saldo){
            throw new SaldoInsuficienteException();
        }
        
        this.saldo -= saldo;
    }
}