package exercicio3;

public class LoginInvalidoException extends Exception {
    
    public LoginInvalidoException(){
        super("Credenciais inválidas. Usuário não encontrado!!");
    }
}