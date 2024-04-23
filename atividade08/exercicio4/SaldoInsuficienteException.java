package exercicio4;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(){
        super("Saldo insuficiente para o valor de saque.");
    }
}