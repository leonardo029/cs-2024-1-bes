package exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        Boolean status = false;
        
        try{

            System.out.println("Usuário: ");
            String user = scanner.nextLine();
            System.out.println("Senha: ");
            String password = scanner.nextLine();
            status = login.fazer_login(user, password);
            scanner.close();
            
        }catch(LoginInvalidoException lie){
            System.out.println("------------ERRO------------");
            System.out.println(lie.getMessage());
        }

        if(status){
            System.out.println("Login realizado com sucesso!");
        }
    }
}