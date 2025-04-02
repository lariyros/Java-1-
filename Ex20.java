/******************************************************************************
20 - Classificação dos números em faixas
*******************************************************************************/
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int faixa1 = 0, faixa2 = 0, acima200 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num >= 0 && num <= 100) {
                faixa1++;
            } else if (num >= 101 && num <= 200) {
                faixa2++;
            } else {
                acima200++;
            }
        }

        System.out.println("Números entre 0 e 100: " + faixa1);
        System.out.println("Números entre 101 e 200: " + faixa2);
        System.out.println("Números acima de 200: " + acima200);
        sc.close();
    }
}