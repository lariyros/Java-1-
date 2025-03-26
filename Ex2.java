/******************************************************************************
segundo programa
*******************************************************************************/
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe a sua idade: ");
        int i = ler.nextInt();  
        
        if (i >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
        

    }
}

