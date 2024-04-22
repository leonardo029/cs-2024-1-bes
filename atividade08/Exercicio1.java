import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do primeiro termo:");
        double value1 = scanner.nextDouble();
        System.out.println("Insira o valor do segundo termo:");
        double value2 = scanner.nextDouble();

        try{
    
            double resultado = value1/value2;
            System.out.println("O resultado da divisão de "+(value1)+" por "+(value2)+" é igual a = "+(resultado));

        }catch(ArithmeticException e1){
        System.out.println("Não é possível realizar divisões por zero!!");
        }catch(InputMismatchException e2){
        System.out.println("Insira um valor numérico!!");
        }
    }
}