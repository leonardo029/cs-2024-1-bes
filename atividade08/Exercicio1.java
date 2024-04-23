import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        
        try{

            System.out.println("Insira o valor do primeiro termo:");
            int value1 = scanner.nextInt();
            System.out.println("Insira o valor do segundo termo:");
            int value2 = scanner.nextInt();
    
            int resultado = value1/value2;
            System.out.println("O resultado da divisão de "+(value1)+" por "+(value2)+" é igual a = "+(resultado));
            
        }catch(ArithmeticException e){
            System.out.println("Não é possível realizar divisões por zero!!");
        }catch(InputMismatchException e){
            System.out.println("Insira um valor numérico!!");
        }
        
        scanner.close();
    }
}