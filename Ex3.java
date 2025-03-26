/******************************************************************************
terceiro programa
*******************************************************************************/
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        

        int n1, n2, n3;
        
        System.out.print("Digite o primeiro número: ");
        n1 = ler.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = ler.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        n3 = ler.nextInt();
        
        int maior = n1;
        if (n2 > maior) maior = n2;
        if (n3 > maior) maior = n3;
        
        System.out.println("O maior número é: " + maior);
        
      
    }
}

