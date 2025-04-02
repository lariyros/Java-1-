/******************************************************************************
12 - Situação do alistamento militar
*******************************************************************************/
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int an = sc.nextInt();

        int aA = java.time.Year.now().getValue();
        int idade = aA - an;

        if (idade < 18) {
            System.out.println("Faltam " + (18 - idade) + " anos para o alistamento.");
        } else if (idade > 18) {
            System.out.println("Já se passaram " + (idade - 18) + " anos do alistamento.");
        } else {
            System.out.println("Você deve se alistar este ano.");
        }

    }
}
