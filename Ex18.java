/******************************************************************************
18 - Soma, média e contagem de maiores de idade
*******************************************************************************/
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, maiores = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            soma += idade;
            if (idade >= 18) {
                maiores++;
            }
        }

        double media = soma / 20.0;
        System.out.println("Soma das idades: " + soma);
        System.out.println("Média das idades: " + media);
        System.out.println("Quantidade de maiores de idade: " + maiores);
    }
}