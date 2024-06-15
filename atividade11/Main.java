package atividade11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ValidaExpressoes validacao = new ValidaExpressoes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Usuário: ");
        String login = scanner.nextLine();
        System.out.println("Senha: ");
        String password = scanner.nextLine();

        if(validacao.ValidaExpressao(login, password)){
            System.out.println("Expressões validadas com sucesso!");
        }else{
            System.out.println("Expressões inválidas. Insira os dados novamente!");
        }

        scanner.close();
    }
}