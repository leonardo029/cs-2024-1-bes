package exercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args){
        
        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);
        Boolean flagStop = false;

        while(true){

            System.out.println("-----Escolha a operação a ser realizada----- ");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Sair");
            
            try{
                
                int opcao = scanner.nextInt();
                double valor;

                switch (opcao) {

                    case 1:
                        System.out.println("Digite o valor a ser depositado:");
                        valor = scanner.nextDouble();
                        contaBancaria.depositar(valor);
                        System.out.println("Deposito realizado com sucesso!");
                        break;

                    case 2:
                        System.out.println("Digite o valor a ser sacado:");
                        valor = scanner.nextDouble();

                        try{
                            contaBancaria.sacar(valor);
                            System.out.println("Saque realizado com sucesso!");

                        }catch(SaldoInsuficienteException sie){
                            System.out.println("------ERRO------");
                            System.out.println(sie.getMessage());
                        }
                        break;

                    case 3:
                        System.out.println("Tchau. Até logo!!");
                        flagStop = true;
                        break;

                    default:
                        System.out.println("Opção inválida ou não existente!");
                }

            }catch(InputMismatchException ime){
                System.out.println("Opção inválida ou não existente. Digite novamente!");
            }

            if(flagStop){
                break;
            }
        }

    scanner.close();
    }
}