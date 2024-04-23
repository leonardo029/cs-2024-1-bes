package exercicio3;

public class Login {
    
    private String user = "LeonardoMoreira";
    private String password = "CS2024.1";

    public Boolean fazer_login(String user, String password) throws LoginInvalidoException {

        if(this.user.equals(user) && this.password.equals(password)){
            return true;
        }
        
        throw new LoginInvalidoException();
    }
}