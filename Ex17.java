/******************************************************************************
17 - Soma de 10 números fornecidos pelo usuário
*******************************************************************************/
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            soma += sc.nextInt();
        }

        System.out.println("Soma dos números: " + soma);
        sc.close();
    }
}