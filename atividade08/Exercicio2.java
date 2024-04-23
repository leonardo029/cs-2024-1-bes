import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        int[] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int value;
        
        try{  
            do{                      
                System.out.println("Digite o valor a ser inserido no vetor: ");
                value = scanner.nextInt();
                numbers[i] = value;
                i++;

            }while(value!=0);
            
        }catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Vetor preenchido, não há mais espaço disponível!");
        }
        catch(InputMismatchException ime){
            System.out.println("Erro! Insira apenas valores numéricos!!");
        }finally{
            System.out.println("Elementos do vetor:");
            for(int j= 0; j<i; j++){
                System.out.print(numbers[j]+" ");
            }
        }

        scanner.close();
    }
}